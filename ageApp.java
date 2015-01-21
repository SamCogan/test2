import java.util.Scanner;
public class ageApp{
	public static void main(String args[]){

		//declare vars
		int age;
		String message;

		//declare objects
		Scanner scan;
		age a;

		//create
		scan=new Scanner(System.in);
		a=new age();

		//input
		//for(int i=0;i<=2;i++){
		do{
			System.out.println("What age are you?");
			age=scan.nextInt();
			//set
			a.setAge(age);
			//call compute
			a.compute();
			//get
			message=a.getMessage();
			//output
			System.out.println(message+" Have a nice day!");
		}
		while(message.equals("Go away!"));
	}
}