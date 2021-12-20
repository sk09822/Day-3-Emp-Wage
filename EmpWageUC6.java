import java.util.Random;

public class EmpWageUC6

{
 
    public static final int IS_FULL_TIME=1;
    public static final int SALARY_PERHR=20;
    public static final int IS_PART_TIME=2;
    public static final int NO_OF_DAYS=20;
    public static final int MAX_HR_IN_MONTH=100;

   public static void main(String[] args)
{
    
    int Working_Hr=0;
     int TotalEmpHrs=0;
    int TotalEmpWorkingDay=0;
    Random rand = new Random();
    int empCheck = rand.nextInt(3);
          while (TotalEmpHrs<=MAX_HR_IN_MONTH && TotalEmpWorkingDay<NO_OF_DAYS)
          {
            TotalEmpWorkingDay++;
            

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
              TotalEmpHrs +=Working_Hr;
                    System.out.println("Day :  " + TotalEmpWorkingDay + "   Emp Hr : " +Working_Hr);
         }
         int totalEmpWage=TotalEmpHrs *SALARY_PERHR;

                  System.out.println("Total Emp Wage : " +totalEmpWage);
}


}