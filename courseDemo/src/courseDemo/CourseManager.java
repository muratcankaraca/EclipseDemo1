package courseDemo;

public class CourseManager {
	public void joinToCourse(Course course) {
		System.out.println(course.name + "adl� kursa kat�ld�n�z!");
		course.flag = true;
	}
	
	public void leaveToCourse(Course course) {
		if(course.flag) {
			System.out.println(course.name + "adl� kurstan ayr�ld�n�z!");
		}
		else {
			System.out.println("Bu kursa kay�tl� de�ilsiniz");
		}
	}

	

}

