package com.internetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File("./Configuration\\config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e)
		{
			System.out.println("Exception is:...."+e.getMessage());
		}
	}
	
	public  String getApplicationURL()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public  String getUsername()		
	{
		String uname=pro.getProperty("username");
		return uname;
	}
	public  String getpassword()		
	{
		String upassword=pro.getProperty("password");
		return upassword;
	}
	public  String getChromepath()		
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public  String getgedckopath()		
	{
		String geckopath=pro.getProperty("geckopath");
		return geckopath;
	}
	public  String idepath()		
	{
		String IEDpath=pro.getProperty("IEDpath");
		return IEDpath;
	}
	

}
