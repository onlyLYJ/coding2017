package ocp.logtype;

import ocp.DateUtil;

/**
 * Created by onlyLYJ on 2017/6/19.
 */
public abstract class LogRawDateType extends LogType {

    public String getLog(String msg) {
        String txtDate = DateUtil.getCurrentDateAsString();
        return txtDate + ": " + msg;
    }
}
