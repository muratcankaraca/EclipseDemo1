
public class UserManager {
	
	
	public void list(User user) {
		System.out.println(user.getName() +  " adl� ki�i listelendi.");
	}
	public void add(User user) {
		System.out.println(user.getName() +  "adl� ki�i eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getName() + " adl� ki�i silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getName() + " adl� ki�inin bilgileri g�ncellendi");
}
	
}