import java.rmi.Naming;

public class Cliente {

	public static void main(String[] args) {
		try {
			InterfaceInfo i = (InterfaceInfo) Naming.lookup("//localhost:1099/InformationService");
			System.out.println(i.showInfo());

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}