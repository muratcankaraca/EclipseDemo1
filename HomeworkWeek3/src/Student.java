
public class Student extends User{
	
	private int succesScore;
	private int numberOfCoursesComplated;
	
	public Student(int id, String name, int age, String email, int succesScore, int numberOfCoursesComplated) {
		super(id, name, age, email);
		
		this.succesScore = succesScore;
		this.numberOfCoursesComplated = numberOfCoursesComplated;
		
	}

	public int getSuccesScore() {
		return succesScore;
	}

	public void setSuccesScore(int succesScore) {
		this.succesScore = succesScore;
	}

	public int getNumberOfCoursesComplated() {
		return numberOfCoursesComplated;
	}

	public void setNumberOfCoursesComplated(int numberOfCoursesComplated) {
		this.numberOfCoursesComplated = numberOfCoursesComplated;
	}
}
