import java.util.*; 

public class JavaLessonFour
{

	public static void main(String args[])
	{

		int c = addNums(1,2);
		System.out.println(c);

		numsAdd(3,4);
	}

	public static int addNums(int a, int b){
		return a + b;
	}

	public static void numsAdd(int a, int b){
		System.out.println(a + b);
	}
}

