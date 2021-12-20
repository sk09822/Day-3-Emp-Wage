import java.util.Random;
class PartTimeUC3{
	public static void main(String[] args){
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;

		int wage_Per_Hr = 20;
		int Working_Hr = 0;
		Random rand = new Random ();
		int empCheck = rand.nextInt(3);
		 if(empCheck == IS_FULL_TIME)
		 {
		 	Working_Hr = 8;
		 }
		 else if(empCheck == IS_PART_TIME) 		
		 {
		 	Working_Hr = 4;
		 }
		 else
		 {
		 	Working_Hr = 0;
		 }

		 int Salary = Working_Hr * wage_Per_Hr;
		 System.out.println("Employee Salary is = " + Salary +  " Rupees ");


	}
}