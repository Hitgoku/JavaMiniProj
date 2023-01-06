import java.util.Scanner;

public class StudentPojo {
	private String studentName;
	private int rollNo;
	private int age;
	private String department;
	
	public StudentPojo(String studentName, int rollNo, int age, String department) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.age = age;
		this.department = department;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public int getAge() {
		return age;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public String toString() {
		return "StudentPojo [studentName=" + studentName + ", rollNo=" + rollNo + ", age=" + age + ", department="
				+ department + "]";
	}

 
}
