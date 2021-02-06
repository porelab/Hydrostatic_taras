package Constants;

public class MyContants {
	
	
	public static String sampleid="MySample",lotno="MyLot";
	public static String stepsize="1";
	public static double maxPressure=4;
	
	public static String testmode,pressurerate,samplearea,maxpressure;
	
	/*test settong*/
	
	public static String incrate,incpr,initpr,delp;

	
	
	//setting parameter
	public static double getInitialPR()
	{
		return 5;
	}
	public static double getIcrementPR()
	{
		//return Double.parseDouble(incpr);
		return 1;
	}
	public static int getDpCheckPoints()
	{
		//return Integer.parseInt(delp);
		return 10;
	}
	public static double getIncrementRate()
	{
		//return Double.parseDouble(incrate);
		return 20;
	}
	public static int getDropPercentage()
	{
		return 20;
	}
	
	
}
