import java.util.Scanner;
import java.lang.Math;

public class JavaLessonTwo 
{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String args[])
	{
		System.out.print("Your favorite Number:");
		if(userInput.hasNextInt()){
			int numberEntered = userInput.nextInt();
			System.out.print(" nice integer \t");
			System.out.print(numberEntered);
		}else{
			System.out.print("cool " + userInput.nextLine());
		}
	}
}