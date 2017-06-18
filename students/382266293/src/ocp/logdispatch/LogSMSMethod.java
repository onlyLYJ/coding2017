package ocp.logdispatch;

import ocp.logdispatch.util.SMSUtil;

/**
 * Created by onlyLYJ on 2017/6/19.
 */
public class LogSMSMethod extends LogMethod {

    @Override
    public void send(String msg) {
        SMSUtil.send(msg);
    }
}
