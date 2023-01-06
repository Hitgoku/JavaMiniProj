import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StudentTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  // Read the user's choice of engineering or graduation
        System.out.print("Enter 1 for engineering or 2 for graduation: ");
        int choice = sc.nextInt();

		// Read the user's course name
        if (choice == 1) {
            System.out.println("Engineering courses: BTech, MTech, BE");
        } else if (choice == 2) {
            System.out.println("Graduation courses: BCA, MCA, BSc, MSc");
        } else {
            System.out.println("Invalid choice.");
        }
		String courseName = sc.next();

		// Set the file name based on the user's course name
		String fileName;
		if (courseName.equalsIgnoreCase("BCA")) {
			fileName = "bca.csv";
		} else if (courseName.equalsIgnoreCase("MCA")) {
			fileName = "mca.csv";
		} else if (courseName.equalsIgnoreCase("BSc")) {
			fileName = "bsc.csv";
		} else if (courseName.equalsIgnoreCase("MSc")) {
			fileName = "msc.csv";
		} else {
			// If the user's course name is invalid, don't write to a file
			fileName = null;
		}

		if (fileName != null) {
			System.out.print("Enter student name: ");
			String studentName = sc.next();

			System.out.print("Enter student roll no: ");
			int rollNo = sc.nextInt();

			System.out.print("Enter student age: ");
			int age = sc.nextInt();

			System.out.print("Enter student department: ");
			String department = sc.next();

			// Create a new StudentPojo object with the input data
			StudentPojo student = new StudentPojo(studentName, rollNo, age, department);

			// Add the student record to the studRec list
			List<StudentPojo> studRec = new ArrayList<>();
			studRec.add(student);
			

			try {
				
				// Create a BufferedWriter and pass it a FileWriter object initialized with the
				// file name and the true flag
				BufferedWriter writer1 = new BufferedWriter(new FileWriter(fileName, true));
				if (new File(fileName).length() == 0) {
					// Write the header row if the file is empty
					writer1.write("Name,RollNo,Age,Department\n");

					// Write the student record data to the file
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
}