import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceInfo extends Remote {
	
	public String showInfo() throws RemoteException;
	
}
