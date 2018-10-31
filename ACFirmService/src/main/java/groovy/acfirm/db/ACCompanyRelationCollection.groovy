package acfirm.db

import acuser.error.Errors
import acuser.utils.ValidateUtils
import chat.errors.CoreException
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoCursor
import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.DBCollection
import org.bson.Document
import script.groovy.annotation.Bean

/**
 * Created by wenqi on 2018/10/26
 */
@Bean
@DBCollection(name = "ac_company_relation", databaseClass = "db.ACFirmDatabase")
class ACCompanyRelationCollection extends MongoCollectionHelper{
    public ACCompanyRelation addCompanyRelation(ACCompanyRelation companyRelation){
        ValidateUtils.checkNotNull(companyRelation)
        MongoCollection<ACCompanyRelation> collection = getMongoCollection()
        Long createTime = System.currentTimeSeconds()
        companyRelation.setCreateTime(createTime)
        try{
            collection.insertOne(companyRelation)
        }catch(Exception exception){
            return new CoreException(Errors.ERROR_FAIL_INSET, "insert company relation error")
        }
        return companyRelation
    }
    public ACCompanyRelation findCompanyRelation(String id){
        ValidateUtils.checkNotNull(id)
        MongoCollection<ACCompanyRelation> collection = getMongoCollection()
        Document query = new Document()
        query.append(ACCompanyRelation.FIELD_ID, id)
        FindIterable<ACCompanyRelation> iterable = collection.find(query)
        MongoCursor<ACCompanyRelation> cursor = iterable.iterator()
        ACCompanyRelation companyRelation = null
        while(cursor.hasNext())
            companyRelation = cursor.next()
        if(cursor != null)
            return cursor
        else
            return Core
    }
    public Long deleteCompanyRelation(){

    }
    public Long updateCompanyRelation(){

    }

}
