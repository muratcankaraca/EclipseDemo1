package courseDemo;

public class UserManager {
	public void createAccount(User user) {
		System.out.println("id: " + user.id + "\nname: " + user.name + "\nemail: " + user.email + "\n bilgileriyle kullanýcý baþarýyla oluþturulmuþtur!");
		System.out.println("----------------------------------------");
		
		user.isRegister = true;
	}
	public void  deleteAccount(User user) {
		if(user.isRegister) {
			System.out.println( "\nname: " + user.name + " adlý kullanýcý baþarýyla kaldýrýldý!");
			System.out.println("----------------------------------------");

		}else {
			System.out.println("Sistemde böyle bir kullanýcý bulunamadý");
			System.out.println("----------------------------------------");
		}
	}
}
