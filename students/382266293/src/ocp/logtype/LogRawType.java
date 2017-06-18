package ocp.logtype;

/**
 * Created by onlyLYJ on 2017/6/19.
 */
public abstract class LogRawType extends LogType {

    public String getLog(String msg) {
        return msg;
    }
}
