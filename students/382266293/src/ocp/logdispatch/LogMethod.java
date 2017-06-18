package ocp.logdispatch;

/**
 * Created by onlyLYJ on 2017/6/19.
 */
public abstract class LogMethod {

    public final int EMAIL_LOG = 1;
    public final int SMS_LOG = 2;
    public final int PRINT_LOG = 3;

    public abstract void send(String msg);
}
