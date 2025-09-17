public class LogLine {

    private String logline;
    public LogLine(String logLine) {
        this.logline = logLine;
    }

    public LogLevel getLogLevel() {
        int lvl = this.logline.indexOf(":") ;
        String logLvl = logline.substring(0,lvl).toUpperCase().replaceAll("[\\s\\[\\]]", "");
        switch (logLvl) {
            case "TRC":
                return LogLevel.TRACE;
            case "DBG":
                return LogLevel.DEBUG;
            case "INF":
                return LogLevel.INFO;
            case "WRN":
                return LogLevel.WARNING;
            case "ERR":
                return LogLevel.ERROR;
            case "FTL":
                return LogLevel.FATAL;
            default:
                return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        int level = this.getLogLevel().getShortLog();
        int lvl = this.logline.indexOf(":") ;
        String logLvl = logline.substring(lvl + 1).trim();
        return level + ":" + logLvl ;
    }
}
