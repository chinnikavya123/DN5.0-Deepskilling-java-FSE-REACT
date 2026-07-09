package SingletonPatternExample;

public class Logger {

    // Stores the single Logger object
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger instance created");
    }

    // Returns the single Logger object
    public static Logger getInstance() {

        // Create object only once
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    // Prints log message
    public void Log(String message) {
        System.out.println("Log: " + message);
    }
}

/*
Things I Learned:
-----------------
1. Singleton Pattern allows only one object of a class.
2. Private constructor prevents object creation from outside.
3. Static instance stores the single object.
4. getInstance() returns the same object every time.
5. Singleton is commonly used for Logger, Configuration and Cache classes.
*/