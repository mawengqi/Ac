package acfirm.db


import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.DBCollection
import script.groovy.annotation.Bean

/**
 * Created by youze on 2018/10/24
 */
@DBCollection(name = "ac_groupuserindex", databaseClass = "db.ACUserDatabase")
@Bean
public class ACGroupUserIndexCollection extends MongoCollectionHelper {



}
