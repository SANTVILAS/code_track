package has_a_relatioship;

public class Student {

	private int studentId;
	private String studentName;

	private Collage collage;// act as a instance variable

	public Student(int studentId, String studentName, Collage collage) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.collage = collage;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collage=" + collage + "]";
	}
	
	

}
