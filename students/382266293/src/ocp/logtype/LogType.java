package ocp.logtype;

/**
 * Created by onlyLYJ on 2017/6/19.
 */
public abstract class LogType {

    public final int RAW_LOG = 1;
    public final int RAW_LOG_WITH_DATE = 2;

    public abstract String getLog(String msg);
}
