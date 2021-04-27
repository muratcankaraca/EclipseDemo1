package courseDemo;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, 0, "C# + ANGULAR ", "Engin Demiroð", "Yazýlým Geliþtirici Yetiþtirme Kampý");

		Course course2 = new Course(2, 99.90, "REACT + JAVA ", "Engin Demiroð", "Yazýlým Geliþtirici Yetiþtirme Kampý");

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			if (course.price == 0) {
				System.out.println("id: " + course.id);
				System.out.println("price: " + "ücretsiz!");
				System.out.println("name: " + course.name);
				System.out.println("tutor: " + course.tutor);
				System.out.println("detail: " + course.detail);
				System.out.println("--------------------");
			} else {
				System.out.println("id: " + course.id);
				System.out.println("price: " + course.price);
				System.out.println("name: " + course.name);
				System.out.println("tutor: " + course.tutor);
				System.out.println("detail: " + course.detail);
				System.out.println("--------------------");
			}
		}

		CourseManager courseManager = new CourseManager();
		courseManager.joinToCourse(course1);
		courseManager.leaveToCourse(course1);
		courseManager.leaveToCourse(course2);

		User user1 = new User(1, "Can", "can@outlook.com", 94838281);
		User user2 = new User(2, "Cankan", "can1@outlook.com", 1948382831);

		User[] users = { user1, user2 };

		for (User user : users) {

			System.out.println("name: " + user.name);
			System.out.println("id: " + user.id);
			System.out.println("--------------------");
		}

		UserManager userManager = new UserManager();
		userManager.createAccount(user1);
		userManager.deleteAccount(user1);
		userManager.deleteAccount(user2);
	}

}
