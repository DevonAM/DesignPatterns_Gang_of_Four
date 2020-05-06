package singleton;

/**
 * lazy loading.
 */
public class DbSingleton {

    //volatile keyword makes threadsafe. Protect from being intantiated through reflection
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if(instance == null) {
            synchronized(DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
