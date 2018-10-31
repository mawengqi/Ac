package acuser.utils

import chat.errors.CoreException
import acuser.error.Errors

public class ValidateUtils {
    public static void checkOffset(Integer offset) {
        if(offset == null)
            throw new CoreException(Errors.ERROR_ILLEGAL_OFFSET, "offset can not be null")

        if(offset < 0)
            throw new CoreException(Errors.ERROR_ILLEGAL_OFFSET, "offset can not be negative")
    }

    public static int checkLimit(Integer limit) {
        if(limit == null)
            throw new CoreException(Errors.ERROR_ILLEGAL_LIMIT, "limit can not be null")

        if(limit < 0)
            throw new CoreException(Errors.ERROR_ILLEGAL_LIMIT, "limit can not be negative")

        if(limit > 1000)
            limit = 1000
        return limit
    }

    public static void checkListNotNull(List<?> param) {
        if(param == null || param.isEmpty())
            throw new CoreException(Errors.ERROR_ILLEGAL_PARAMETERS)
    }

    public static void checkAnyNotNull(Object... params) {
        for(def it : params) {
            if(it != null)
                return
        }
        throw new CoreException(Errors.ERROR_ILLEGAL_PARAMETERS)
    }
    public static void checkAllNotNull(Object... params) {
        for(def it : params) {
            if(it == null)
                throw new CoreException(Errors.ERROR_ILLEGAL_PARAMETERS)
        }
    }
    public static void checkNotNull(def param) {
        if(param == null)
            throw new CoreException(Errors.ERROR_ILLEGAL_PARAMETERS)
    }

    public static void checkEqualAny(def param, Object... values) {
        if(param == null)
            return
        boolean hit = false
        if(values == null)
            throw new CoreException(Errors.ERROR_ILLEGAL_PARAMETERS)
        if(!hit) {
            for(Object value : values) {
                if(param == value) {
                    hit = true
                    break
                }
            }
        }
        if(!hit)
            throw new CoreException(Errors.ERROR_ILLEGAL_PARAMETERS)
    }

    public static void checkGT0(def param) {
        if(param == null || param <= 0)
            throw new CoreException(Errors.ERROR_ILLEGAL_PARAMETERS)
    }

    public static def checkWithDefault(def param, def defaultValue) {
        if(param == null)
            return defaultValue
        return param
    }

    public static void checkSortType(Integer integer) {
        if (integer != -1 || integer != 1) {
            throw new CoreException(Errors.ERROR_ILLEGAL_SORT, "sort type $integer is invalid")
        }
    }

}
