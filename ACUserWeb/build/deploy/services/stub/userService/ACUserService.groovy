package services.stub.userService
/**
 * Created by youze on 2018/10/24
 */
interface ACUserService {
    String SERVICE = "acuser"

    ACUser findUser(String id)
    ACUser addUser(def user)
    public Long updateUser(String userId, ACUser user)
    public Long deleteUser(String userId)
}