package acuser.rest

import script.groovy.servlet.annotation.ControllerMapping
import script.groovy.servlet.annotation.RequestMapping
import script.groovy.servlets.GroovyServlet
import utils.RuntimeUtils

/**
 * Created by wenqi on 2018/10/26
 */
@ControllerMapping
class ACUserController {
    @RequestMapping(uri = "@PREFIX/addUser", method = GroovyServlet.GET)
    public def addUser(){
        acuser.userService.ACUserService userService = RuntimeUtils.getService(this, acuser.userService.ACUserService.SERVICE, acuser.userService.ACUserService.class)
        acuser.userService.ACUser user = new acuser.userService.ACUser()
        user.setAddress("china")
        user.setEmail("1051315675@qq.com")
        user = userService.addUser(user)
        println user
    }
    @RequestMapping(uri = "@PREFIX/updateUser", method = GroovyServlet.GET)
    public def updateUser(){
        acuser.userService.ACUserService userService = RuntimeUtils.getService(this, acuser.userService.ACUserService.SERVICE, acuser.userService.ACUserService.class)
        acuser.userService.ACUser user = new acuser.userService.ACUser();
//        user.setId("5bd2caadc792cc5d7c1c2f4f")
        user.setEmail("123@qq.com")
        user.setCountry("china")
        userService.updateUser("5bd2caadc792cc5d7c1c2f4f",user)
    }

}
