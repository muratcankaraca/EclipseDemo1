
public class Instructor extends User{

	private int numberOfStudent;
	private int numberOfCourse;
	
	
	
	public Instructor(int id, String name, int age, String email, int numberOfStudent,int numberOfCourse) {
		super(id, name, age, email);
	
		this.numberOfStudent = numberOfStudent;
		this.numberOfCourse =  numberOfCourse;
	
	}



	public int getNumberOfStudent() {
		return numberOfStudent;
	}



	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}



	public int getNumberOfCourse() {
		return numberOfCourse;
	}



	public void setNumberOfCourse(int numberOfCourse) {
		this.numberOfCourse = numberOfCourse;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	

