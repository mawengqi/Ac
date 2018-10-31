package acuser.test

import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.Database

/**
 * Created by wenqi on 2018/10/31
 */
@Database(name = "chinese_people")
class ChinesePeopleDatabase extends MongoCollectionHelper{
}
