import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

	public Servidor() {
		try {
			Registry registry = LocateRegistry.createRegistry(1099);
			Info c = new Info();
			registry.bind("InformationService", c);
			System.out.println("Server Running...");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		new Servidor();
	}

}
