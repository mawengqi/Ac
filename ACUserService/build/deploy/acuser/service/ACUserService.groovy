package acuser.service

import com.docker.rpc.remote.annotations.RemoteService
import acuser.data.ACUser
import acuser.db.ACUserCollection
import script.groovy.annotation.Bean

/**
 * Created by wenqi on 2018/10/24
 */
@RemoteService
class ACUserService implements IACUserService{
    @Bean
    private ACUserCollection userCollection

    ACUser findUser(String id) {
        ACUser user = userCollection.findUser(id);
    }

    ACUser addUser(ACUser user) {
        user = userCollection.addUser(user)
        return user
    }

    Long updateUser(String userId, ACUser user) {
        Long updateTime = userCollection.updateUser(userId, user)
        return updateTime
    }

    Long deleteUser(String userId) {
        Long deleteTime = userCollection.deleteUser(userId)
        return deleteTime
    }
}
