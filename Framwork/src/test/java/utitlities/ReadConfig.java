package utitlities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src =new File("./configuration\\config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Excetion is:  "+e.getMessage());
		}
		
	}
	


	
	public String getURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String userName=pro.getProperty("userName");
		return userName;
	}
	
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getChromeBrowser() {
		String chroBrowser=pro.getProperty("chromePath");
		return chroBrowser;
	}
	
	

}
