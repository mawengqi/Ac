package acfirm.db

import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.DBCollection

/**
 * Created by wenqi on 2018/10/26
 */
@DBCollection(name = "ac_firm", databaseClass = "db.ACFirmDatabase")
class ACFirmCollection extends MongoCollectionHelper{

}
