import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer extends UnicastRemoteObject
        implements MyRemote {

    public MyServer() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Hello from RMI Server!";
    }

    public static void main(String[] args) {
        try {
            Registry registry =
                    LocateRegistry.createRegistry(1099);

            MyServer server = new MyServer();

            registry.rebind("HelloService", server);

            System.out.println("RMI Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}