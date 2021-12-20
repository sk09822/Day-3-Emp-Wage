import java.util.Random;
class DailyEmpWage{

	public static void main(String[] args)
	{
		int IS_PRESENT = 1;
		int wage_Per_Hr = 20;
		int Working_Hr = 8;
		Random rand = new Random();
		int empCheck = rand.nextInt(2); 
		if (empCheck == IS_PRESENT)
		{
				Working_Hr = 8;
		}
		
		
		double Salary = Working_Hr * wage_Per_Hr;
			System.out.println("Employee Salary is =" +Salary+ " Rupees");
	}
}