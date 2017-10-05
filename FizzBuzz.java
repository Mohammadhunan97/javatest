import java.util.*; 

public class FizzBuzz
{
	public static void main(String args[])
	{
		for(int i = 1; i < 100; i++){
			String return_value = (i%15 == 0)? "fizzbuzz": (i%3 == 0)? "fizz" : (i%5 == 0)? "buzz": Integer.toString(i);
			System.out.println(return_value);
		}
	}
}
