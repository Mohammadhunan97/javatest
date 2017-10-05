import java.util.*; 

public class JavaLessonFour
{
	public static void main(String args[])
	{
		// int i = 1;
		// while(i < 20){
		// 	System.out.println(i + "\n");
		// 	i++;
		// }

		// for(int i = 0; i <= 20; i++){
		// 	System.out.print(i + "\t");
		// }
		// System.out.println("");
		for(int i = 0; i <= 100; i++){
			String return_value = (i%15 == 0)? "fizzbuzz": (i%3 == 0)? "fizz" : (i%5 == 0)? "buzz": Integer.toString(i);
			System.out.println(return_value);
		}
	}
}
