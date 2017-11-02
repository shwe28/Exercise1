import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.print("Please enter your name : ");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		HelloUser user = new HelloUser();
		user.greetUser(userName);
		sc.close();
	}

}
