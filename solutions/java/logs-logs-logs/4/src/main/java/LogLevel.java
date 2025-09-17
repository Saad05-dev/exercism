public enum LogLevel {
    // TODO: define members for each log level
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42),
    UNKNOWN(0);

    private final int shortLog;

    LogLevel(int shortLog)
    {
        this.shortLog = shortLog;
    }
    public int getShortLog()
    {
        return this.shortLog;
    }
}
