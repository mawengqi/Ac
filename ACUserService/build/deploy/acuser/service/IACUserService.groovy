package acuser.service

import acuser.data.ACUser

/**
 * Created by youze on 2018/10/24
 */
interface IACUserService {
    String SERVICE = "acuser"

    ACUser findUser(String id)
    ACUser addUser(ACUser user)
    public Long updateUser(String userId, ACUser user)
    public Long deleteUser(String userId)
}