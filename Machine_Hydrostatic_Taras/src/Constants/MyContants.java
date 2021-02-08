package Constants;

import java.util.List;

import application.Database;

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
		return 15;
	}
	public static int getDropPercentage()
	{
		return 20;
	}
	
	public static String getincrate()
	{
		String incrate="";
		Database db=new Database();		
		List<List<String>> ll=db.getData("select incrate from test_setting");
		incrate =(ll.get(0).get(0));

		return incrate;
	}
	public static String getincpr()
	{
		String incpr="";
		Database db=new Database();		
		List<List<String>> ll=db.getData("select incpr from test_setting");
		incpr =(ll.get(0).get(0));

		return incpr;
	}
	public static String getinitpr()
	{
		String initpr="";
		Database db=new Database();		
		List<List<String>> ll=db.getData("select initpr from test_setting");
		initpr =(ll.get(0).get(0));

		return initpr;
	}

	public static String getdelp()
	{
		String delp="";
		Database db=new Database();		
		List<List<String>> ll=db.getData("select delp from test_setting");
		delp =(ll.get(0).get(0));

		return delp;
	}

}
