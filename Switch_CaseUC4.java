import java.util.Random;

class Switch_Case{
	public static final int IS_FULL_TIME=1;
    public static final int Wage_Per_Hr=20;
    public static final int IS_PART_TIME=2;

	public static void main(String[] args)
	{
					
		Random rand = new Random();
		int empCheck = rand.nextInt(3);
		int Working_Hr=0;

         switch(empCheck)
              {
             case IS_FULL_TIME: {
               Working_Hr=8;
              break;
          }
             case IS_PART_TIME:{
                Working_Hr=4;
             break;
         }
            default:{
              Working_Hr=0;
          }
             }
         double Salary=Working_Hr* Wage_Per_Hr;
                  System.out.println("Emplyee Salary is="+Salary+  "  Rupees");	
	}
}