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
		return 1.5;
	}
	public static int getDpCheckPoints()
	{
		return 3;
	}
	public static double getIncrementRate()
	{
		return 0.015;
	}
	public static int getDropPercentage()
	{
		return 90;
	}
	
	
}
