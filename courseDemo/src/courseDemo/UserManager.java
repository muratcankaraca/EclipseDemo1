package courseDemo;

public class UserManager {
	public void createAccount(User user) {
		System.out.println("id: " + user.id + "\nname: " + user.name + "\nemail: " + user.email + "\n bilgileriyle kullan�c� ba�ar�yla olu�turulmu�tur!");
		System.out.println("----------------------------------------");
		
		user.isRegister = true;
	}
	public void  deleteAccount(User user) {
		if(user.isRegister) {
			System.out.println( "\nname: " + user.name + " adl� kullan�c� ba�ar�yla kald�r�ld�!");
			System.out.println("----------------------------------------");

		}else {
			System.out.println("Sistemde b�yle bir kullan�c� bulunamad�");
			System.out.println("----------------------------------------");
		}
	}
}
