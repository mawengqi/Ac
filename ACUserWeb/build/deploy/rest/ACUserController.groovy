package rest

import script.groovy.servlet.annotation.ControllerMapping
import script.groovy.servlet.annotation.RequestMapping
import script.groovy.servlet.annotation.RequestParam
import script.groovy.servlets.GroovyServlet
import services.stub.userService.ACUser
import services.stub.userService.ACUserService
import utils.RuntimeUtils

/**
 * Created by wenqi on 2018/10/26
 */
@ControllerMapping
class ACUserController {
    @RequestMapping(uri = "@PREFIX/addUser", method = GroovyServlet.GET)
    public def addUser(){
        ACUserService userService = RuntimeUtils.getService(this, ACUserService.SERVICE, ACUserService.class)
        ACUser user = new ACUser()
        user.setAddress("china")
        user.setEmail("1051315675@qq.com")
        user = userService.addUser(user)
        println user
    }
    @RequestMapping(uri = "@PREFIX/updateUser", method = GroovyServlet.GET)
    public def updateUser(){
        ACUserService userService = RuntimeUtils.getService(this, ACUserService.SERVICE, ACUserService.class)
        ACUser user = new ACUser();
//        user.setId("5bd2caadc792cc5d7c1c2f4f")
        user.setEmail("123@qq.com")
        user.setCountry("china")
        userService.updateUser("5bd2caadc792cc5d7c1c2f4f",user)
    }

}
