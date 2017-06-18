package ocp.logdispatch;

/**
 * Created by onlyLYJ on 2017/6/19.
 */
public class LogPrintMethod extends LogMethod {

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }
}
