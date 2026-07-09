package SingletonPatternExample;

public class Test {

    public static void main(String[] args) {

        // Get Logger object
        Logger l1 = Logger.getInstance();

        // Get same Logger object again
        Logger l2 = Logger.getInstance();

        // Print log messages
        l1.Log("Application Started");
        l2.Log("User Logged in");
    }
}
/*
Output:
------
Logger instance created
Log: Application Started
Log: User Logged in

Things I Learned:
-----------------
1. Multiple calls to getInstance() return the same object.
2. Logger object is created only once.
3. Singleton saves memory by avoiding multiple objects.
4. Singleton provides a global access point to the object.
*/