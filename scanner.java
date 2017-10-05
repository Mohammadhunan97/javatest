import java.util.*; 

public class JavaLessonFour
{
	static Scanner userinput = new Scanner(System.in);

	public static void main(String args[])
	{
		String YorN = "Y";

		int h = 1;

		while(YorN.equalsIgnoreCase("y")){
			System.out.print("Continue y or n?: ");
			YorN = userinput.nextLine();
		}
	}
}

