package acuser.interceptors

import chat.errors.CoreException
import chat.json.ObjectResult
import chat.logs.LoggerEx
import com.alibaba.fastjson.JSON
import script.groovy.servlets.RequestHolder
import script.groovy.servlets.RequestIntercepter

import javax.servlet.http.HttpServletResponse

class CommonIntercepter extends RequestIntercepter {
    private static final String TAG = CommonIntercepter.class.getSimpleName();

    @Override
    public void invoke(RequestHolder holder) throws CoreException {
        Object returnValue = super.proceed(holder)
        String contentType = holder.getResponse().getContentType()
        //兼容以前的模式
        if (contentType != "application/json") {
            ObjectResult result = new ObjectResult()
            result.setCode(1)
            if (returnValue != null) {
                result.setData(returnValue)
            }
            respond(holder.getResponse(), result)
        }
    }

    @Override
    public void invokeError(Throwable t, RequestHolder holder) {
        t.printStackTrace();
//		LoggerEx.error(TAG, t.getLocalizedMessage() + ": " + t.getStackTrace());
//		LoggerEx.error(TAG, t.getMessage() + "：" + t.printStackTrace());
        LoggerEx.error(TAG, holder.getRequest().getRequestURI() + " occured error " + t.getMessage());
        if (t instanceof CoreException) {
//			holder.getResponse().sendError(500, ((CoreException)t).getCode() + ": " + t.getMessage());
            ObjectResult result = new ObjectResult()
            result.setCode(((CoreException) t).getCode())
            result.setData(((CoreException) t).getData())
            result.setMsg(t.getMessage())
            respond(holder.getResponse(), result);
        } else {
            holder.getResponse().sendError(500, t.getMessage());
        }
    }

    void respond(HttpServletResponse response, Object result) {
//        JsonBuilder builder = new JsonBuilder(map);
//        String returnStr = builder.toString();
//		String returnStr = JsonOutput.toJson(map);
        String returnStr = JSON.toJSONString(result)

        response.setContentType("application/json");
//        LoggerEx.debug(this.getClass().getSimpleName(), "respond " + returnStr);
        response.getOutputStream().write(returnStr.getBytes("utf-8"));
    }
}
