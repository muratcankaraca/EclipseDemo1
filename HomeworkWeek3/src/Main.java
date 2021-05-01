
public class Main {

	public static void main(String[] args) {

		System.out.println("|--------------------------------------------------------------|");
		System.out.println(">E�itmen Operasyonlar�<");

		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(1, "Engin Demiro�", 30, "engin@hotmail.com", 1500, 20);
		instructor.setName("ENGIN DEMIRO�");
		instructorManager.update(instructor);

		System.out.println("|---------------------------------------------------------------|");
		System.out.println(">��renci Operasyonlar�<");

		StudentManager studentManager = new StudentManager();
		Student student1 = new Student(1,"Muratcan", 21 ,"muratcankaraca@hotmail.com",100,75);
		Student student2 = new Student(2,"Do�an", 21 ,"muratcankaraca@hotmail.com",95,36);
		student1.setId(2);
		studentManager.update(student1);
		
		System.out.println("|--------------------------------------------------------------|");
		System.out.println(">T�m Ki�ilerin Listesi<");
		UserManager userManager = new UserManager();
		System.out.println("|--------------------------------------------------------------|");
		System.out.println(">��renci Listesi<");
		userManager.list(student1);
		userManager.list(student2);
		System.out.println("|--------------------------------------------------------------|");

		System.out.println(">E�itmen Listesi<");

		userManager.list(instructor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
