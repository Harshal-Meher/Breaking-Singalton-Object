import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            Singleton instance1 = Singleton.getInstance();
            Singleton instance2 = null;

            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance2 = constructor.newInstance(); // Breaks Singleton

            System.out.println("Instance 1 HashCode: " + instance1.hashCode());
            System.out.println("Instance 2 HashCode: " + instance2.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
