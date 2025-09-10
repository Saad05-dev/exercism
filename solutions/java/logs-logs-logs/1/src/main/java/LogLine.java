public class LogLine {

    private String logline;
    public LogLine(String logLine) {
        this.logline = logLine;
    }

    public LogLevel getLogLevel() {
        int lvl = this.logline.indexOf(":") ;
        String logLvl = logline.substring(0,lvl).toUpperCase().replaceAll("[\\s\\[\\]]", "");
        return LogLevel.valueOf(logLvl);
    }

    public String getOutputForShortLog() {
        throw new UnsupportedOperationException("Please implement the getOutputForShortLog() method");
    }
}
