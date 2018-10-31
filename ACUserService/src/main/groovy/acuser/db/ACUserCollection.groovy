package acuser.db

import chat.errors.CoreException
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoCursor
import com.mongodb.client.model.UpdateOptions
import com.mongodb.client.result.UpdateResult
import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.DBCollection
import acuser.data.ACUser
import acuser.error.Errors
import org.bson.Document
import script.groovy.annotation.Bean
import script.memodb.ObjectId
import acuser.utils.ValidateUtils

/**
 * Created by youze on 2018/10/24
 */
@DBCollection(name = "ac_user", databaseClass = "db.ACUserDatabase")
@Bean
public class ACUserCollection extends MongoCollectionHelper {
    public ACUser addUser(ACUser user){
        ValidateUtils.checkNotNull(user)
        user.setId(ObjectId.get().toString())
        Long time = System.currentTimeSeconds()
        user.setRegisterTime(time)
        user.setUpdateTime(time)
        user.setLastAccessTime(time)
        user.setDeleteTime(0L)
        user.setLastLoginTime(lastLoginTime)
        MongoCollection<ACUser> collection = getMongoCollection()
        try{
            collection.insertOne(user)
        }catch(Exception exception){
            throw new CoreException(Errors.ERROR_FAIL_INSET, "User regist failed")
        }
        return user
    }

    public ACUser findUser(String id){
        ValidateUtils.checkNotNull(id)
        MongoCollection<ACUser> collection = getMongoCollection()
        Document query = new Document()
        query.append(ACUser.FIELD_ID, id)
        FindIterable<ACUser> iterable = collection.find(query)
        MongoCursor<ACUser> cursor = iterable.iterator()
        ACUser user = null
        while(cursor.hasNext())
            user = cursor.next()
        return user
    }
    /**
     * 使用deleteTime删除， 存储删除时间点到deleteTime中
     * @param userId
     * @return deleteTime
     */
    public Long deleteUser(String userId) {
        ValidateUtils.checkNotNull(userId)
        MongoCollection<ACUser> collection = getMongoCollection()
        Document query = new Document()
        query.append(ACUser.FIELD_ID, userId)
        Long deleteTime = System.currentTimeSeconds()
        Document update = new Document()
        update.append("\$set", new Document().append(ACUser.FIELD_DELETETIME, deleteTime))
        UpdateResult result = collection.updateOne(query, update, new UpdateOptions().upsert(false))
        if(result.modifiedCount>0)
            return deleteTime
        else
            return null
    }

    /**
     *
     * @param userId
     * @param user
     * @return updateTime
     */
    public Long updateUser(String userId, ACUser user) {
        ValidateUtils.checkAllNotNull(userId, user)
        MongoCollection<ACUser> collection = getMongoCollection()
        Long updateTime = System.currentTimeSeconds()
        user.setUpdateTime(updateTime)
        Document update = user.toDocument()
        Document query = new Document()
        query.append(ACUser.FIELD_ID, userId)
        UpdateResult result = collection.updateOne(query, update, new UpdateOptions().upsert(false))
        if(result.modifiedCount>0)
            return user
        else
            throw new CoreException(Errors.ERROR_FAIL_UPDATE ,"Update user failed")

    }


}
