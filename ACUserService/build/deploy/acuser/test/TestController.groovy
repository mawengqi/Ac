package acuser.test

import script.groovy.annotation.Bean
import script.groovy.servlet.annotation.ControllerMapping
import script.groovy.servlet.annotation.RequestMapping
import script.groovy.servlets.GroovyServlet

/**
 * Created by wenqi on 2018/10/31
 */
@ControllerMapping
class TestController {
    @Bean
    private ChinesePeopleCollection collection;
    @RequestMapping(uri = "@PREFIX/addPeople", method = GroovyServlet.GET)
    public ChinesePeople addPeople(){
        ChinesePeople people = new ChinesePeople()
        people.setName("mawenqi")
        people.setPrivince("shanxi")
        println collection.addPeople(people)
    }

    @RequestMapping(uri = "@PREFIX/findPeoples", method = GroovyServlet.GET)
    public List<ChinesePeople> getPeoples(){
       return  collection.getPeoples()
    }
}
