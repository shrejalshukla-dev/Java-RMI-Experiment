import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        try {
            Registry registry =
                    LocateRegistry.getRegistry("localhost", 1099);

            MyRemote remote =
                    (MyRemote) registry.lookup("HelloService");

            System.out.println(remote.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}