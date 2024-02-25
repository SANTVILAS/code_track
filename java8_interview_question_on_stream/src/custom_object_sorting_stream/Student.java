package custom_object_sorting_stream;

public class Student {
	private int studentId;
	private String stuedentName;
	
	
	public Student(int studentId, String stuedentName) {
		super();
		this.studentId = studentId;
		this.stuedentName = stuedentName;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStuedentName() {
		return stuedentName;
	}


	public void setStuedentName(String stuedentName) {
		this.stuedentName = stuedentName;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", stuedentName=" + stuedentName + "]";
	}
	
	
	
	
}
