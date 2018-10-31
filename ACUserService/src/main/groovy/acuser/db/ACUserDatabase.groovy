package acuser.db;

import connectors.mongodb.MongoDatabaseHelper;
import connectors.mongodb.annotations.Database;

/**
 * Created by youze on 2018/10/24
 */
@Database(name = "ac_user")
public class ACUserDatabase extends MongoDatabaseHelper {

}