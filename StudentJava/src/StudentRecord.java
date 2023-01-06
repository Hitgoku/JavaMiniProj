import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRecord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   

     
		System.out.print("Enter student name: ");
		String studentName = sc.next();

		System.out.print("Enter student roll no: ");
		int rollNo = sc.nextInt();

		System.out.print("Enter student age: ");
		int age = sc.nextInt();

		System.out.print("Enter student department: ");
		String department = sc.next();
		StudentPojo student = new StudentPojo(studentName, rollNo, age, department);
		List<StudentPojo> studRec = new ArrayList<>();
		studRec.add(student);
		try {
	
			File file1 = new File(studentName+".csv");
			 
			BufferedWriter writer1 = new BufferedWriter(new FileWriter(file1, true));
			if (file1.length() == 0) {
				writer1.write("Name,RollNo,Age,Department\n");

				for (StudentPojo name : studRec) {
					writer1.write(name.getStudentName() + "," + name.getRollNo() + "," + name.getAge() + ","
							+ name.getDepartment() + "\n");
				}

			} else {
				for (StudentPojo name : studRec) {
					writer1.write(name.getStudentName() + "," + name.getRollNo() + "," + name.getAge() + ","
							+ name.getDepartment() + "\n");
				}

			}
			writer1.close();

		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}