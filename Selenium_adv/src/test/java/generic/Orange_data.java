package generic;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Orange_data 
{
	String path="./data.properties";
	//public String un;
	//public String pwd;
	
	public ArrayList username(String un,String pwd)
	{
		ArrayList a=new ArrayList();
		try
		{
		Properties p=new Properties();
		p.load(new FileInputStream(path)); 
		un=p.getProperty(un);
		pwd=p.getProperty(pwd);
		a.add(un);
		a.add(pwd);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return a;
	}
	
}