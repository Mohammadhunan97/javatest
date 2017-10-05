import java.util.Scanner;
import java.lang.Math;

public class JavaLessonTwo 
{

	public static void main(String args[])
	{
		System.out.print("pick your favorite letter: ");
		Scanner userInput = new Scanner(System.in);
		char foo = userInput.next().charAt(0);
		switch(foo){
			case 'A': 
				System.out.println("A is for apples");
				break;
			case 'B': 
				System.out.println("B is for bananas");
				break;
			case 'C': 
				System.out.println("C is for cats");
				break;
			default: 
				System.out.println("that's not a letter");
				break;
		}
	}
}