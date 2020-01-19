import java.util.Scanner;

public class HelloSpring{
	
	public static void main(String arg[]) {
		
		Student student = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Name of the Student : "+student.getName());

		
		System.out.println("\nPlease enter name to set Student.\n");
		
		student.setName(scanner.nextLine());
		
		System.out.println("Student new name : "+student.getName());

		scanner.close();
		
	}
	
}