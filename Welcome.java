import java.util.Scanner;
public class Welcome{
	public static void main(String [] args){
		Scanner name = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String FirstName = name.nextLine();
		System.out.println("Enter your Last Name: ");
		String LastName = name.nextLine();
		System.out.println("Welcome to the Second Year " + FirstName + " " + LastName);
	}
}