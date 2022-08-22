public class LogLevels {
    
    public static String message(String logLine) {
        if(logLine.contains("ERROR")){
            return logLine.replace("[ERROR]:", "").trim();
        } else if (logLine.contains("WARNING")) {
            return logLine.replace("[WARNING]:", "").trim();
        }
        else{
            return logLine.replace("[INFO]:", "").trim();
        }
    }

    public static String logLevel(String logLine) {
        if(logLine.contains("ERROR")){
            return "error";
        } else if (logLine.contains("WARNING")) {
            return "warning";
        }
        else{
            return "info";
        }
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
