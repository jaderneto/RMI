import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class Info extends UnicastRemoteObject implements InterfaceInfo{

	public Info() throws RemoteException {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public String showInfo() throws RemoteException {
		// TODO Auto-generated method stub
		String soName = System.getProperty("os.name");
		String soVersion = System.getProperty("os.version");
		String userName = System.getProperty("user.name");
		
		InetAddress me = null;
		try {
			me = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ip = me.getHostAddress();
		
		String value = "NOME SO: " + soName + "\n" + "VERSÃO SO: " + soVersion + "\n" + "USER NAME: " + userName + "\nIP: " + ip;

		System.out.println("Sending informations to Cliente...");
		
		return value;
	}

}
