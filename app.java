import java.util.Scanner;

public class app{
	public static void main(String args[]){

		//declare variables
		int x;
		int y;
		int z;
		int ans;

		//declare objects
		Scanner k;
		calc c;
		//create objects
		k = new Scanner(System.in);
		c = new calc();

		//accept input from user
		System.out.println("Please enter a number");
		x=k.nextInt();
		c.setX(x);

		System.out.println("Please enter a number");
		y=k.nextInt();
		c.setY(y);

		System.out.println("Please enter a number");
		z=k.nextInt();
		c.setZ(z);
		//compute
		c.compute();


		ans=c.nci();




		//outputs
		System.out.println("The answer is "+ans+ ". Thank you");
		System.out.println("The numbers were " +x+","+y+","+z);



	}
}