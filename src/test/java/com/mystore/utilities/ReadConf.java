package com.mystore.utilities;

import java.io.FileInputStream;



public class ReadConf {
	
	
	//for storing the file here create object of properties class
	java.util.Properties Properties;
    String path = "C:\\Users\\DELL\\eclipse-workspace\\MyStore\\Confriguration\\config.properties";
    
    
   //create constructor
    public ReadConf()
    {
    	//initialize properties object
    	Properties = new java.util.Properties();
    	//read propertied file
    	FileInputStream fis;
		try {
			fis = new FileInputStream(path);
       //load the file
    	    Properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    //read the value of baseurl
    public String getbaseurl()
    {
    	//for read the value use get property methods
    	String value = Properties.getProperty("baseUrl");
    	
    	//value me null to nhi hai we have to check
    	if (value!=null)
    		return value;
    	else
    		throw new RuntimeException("url not specified in conf. file");
    }
    
  //read the value of browser
    public String getbrowser()
    {
    	//for read the value use get property methods
    	String value = Properties.getProperty("browser");
    	
    	//value me null to nhi hai we have to check
    	if (value!=null)
    		return value;
    	else
    		throw new RuntimeException("url not specified in conf. file");
    }
    
    
    
}


