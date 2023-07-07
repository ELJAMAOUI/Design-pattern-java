package adapter;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Client("mohamed"));
        ImpIAdaptee employe = new ImpIAdaptee("ismail", "docteur");
        list.add(new EmployeAdapter(employe));
        Utilisateur.AfficherUtilisateur();
	}
}
