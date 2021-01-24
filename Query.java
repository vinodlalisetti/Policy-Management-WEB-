package util;

public class Query {
	public static String adminAuthentication = "select * from admin where username=? and password=?";
	  public static String addPolicy = "insert into policy values(?,?,?)";
	  public static String viewPolicy = "select * from policy";
	  public static String editPolicy = "update policy set name=?,contact=? where id=?";
	  public static String removePolicy = "delete from policy where id=?";
}
