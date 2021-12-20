import java.util.Random;
class EmpPreAbs{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int attendence = rand.nextInt(2);
		System.out.println(attendence);

	     if(attendence == 0)
	     {
	     	System.out.println("Employee is Absent");
	     }
	     else
	     {
	     	System.out.println("Employee is Present");
	     }
	}
}