package acuser.test

import com.mongodb.BasicDBList
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoCursor
import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.DBCollection
import org.bson.Document
import script.groovy.annotation.Bean

/**
 * Created by wenqi on 2018/10/31
 */
@Bean
@DBCollection(name = "chinese_people", databaseClass = "acuser.test.ChinesePeopleDatabase")
class ChinesePeopleCollection extends MongoCollectionHelper{
    ChinesePeople addPeople(ChinesePeople people){
        MongoCollection<ChinesePeople> collection = getMongoCollection();
        collection.insertOne(people)
    }

    ChinesePeople getPeople(String id){
        MongoCollection<ChinesePeople> collection = getMongoCollection();
        Document query = new Document("_id", id)
        return collection.find(query).iterator().next()
    }

    List<ChinesePeople> getPeoples(){
        MongoCollection<ChinesePeople> collection = getMongoCollection()
        BasicDBList dbList = new BasicDBList()
        dbList.add(new Document("privince","shanxi"))
        dbList.add(new Document("name","mawenqi"))
        FindIterable<ChinesePeople> iterable = collection.find(dbList)
        MongoCursor<ChinesePeople> cursor = iterable.iterator()
        List<ChinesePeople> list = new ArrayList<>()
        while(cursor.hasNext())
            list.add(cursor.next())
        return list
    }
}
