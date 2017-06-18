package ocp.logdispatch;

import ocp.logdispatch.util.MailUtil;

/**
 * Created by onlyLYJ on 2017/6/19.
 */
public class LogMailMethod extends LogMethod {

    @Override
    public void send(String msg) {
        MailUtil.send(msg);
    }
}
