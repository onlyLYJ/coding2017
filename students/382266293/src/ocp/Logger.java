package ocp;

import ocp.logdispatch.LogMethod;
import ocp.logtype.LogType;

public class Logger {

    LogType logType;
    LogMethod method;

    public Logger(LogType logType, LogMethod logMethod) {
        this.logType = logType;
        this.method = logMethod;
    }

    public void log(String msg) {

        String logMsg = logType.getLog(msg);

        method.send(logMsg);

    }
}

