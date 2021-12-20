import java.util.Random;

class Month_Wage{

    public static final int NO_OF_DAYS = 20;
	public static final int SALARY_PER_HR = 20;
    public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static void main(String[] args)
	{
			int Working_Hr=0;
        int EmpWage=0;
       int TotalEmpWage=0; 
       
       Random rand =new Random();
       int empCheck = rand.nextInt(3);
    	
    	for (int day=0;day<NO_OF_DAYS;day++)
    	{
    		
        	 switch(empCheck)
             {
               case IS_FULL_TIME:   Working_Hr=8;
                break;
               case IS_PART_TIME:
                         Working_Hr=4;
               break;
              default:
                  Working_Hr=0;
             }
        	 
          EmpWage=Working_Hr*SALARY_PER_HR;
            TotalEmpWage +=EmpWage;
                System.out.println("Emp Wage :  " + EmpWage);
     }

              System.out.println("Total Emp Wage : " +TotalEmpWage);
}

		

		}
	