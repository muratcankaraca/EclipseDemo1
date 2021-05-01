
public class UserManager {
	
	
	public void list(User user) {
		System.out.println(user.getName() +  " adlý kiþi listelendi.");
	}
	public void add(User user) {
		System.out.println(user.getName() +  "adlý kiþi eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getName() + " adlý kiþi silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getName() + " adlý kiþinin bilgileri güncellendi");
}
	
}