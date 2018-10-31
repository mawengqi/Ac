package utils

import com.docker.script.MyBaseRuntime
import script.groovy.runtime.GroovyRuntime

/**
 * Created by Royal chan
 */
public class RuntimeUtils {
  public static def getService(def caller, String service, Class serviceClass){
    MyBaseRuntime baseRuntime = GroovyRuntime.getCurrentGroovyRuntime(caller.getClass().getClassLoader())
    return baseRuntime.getServiceStubManager().getService(service, serviceClass)
  }

}
