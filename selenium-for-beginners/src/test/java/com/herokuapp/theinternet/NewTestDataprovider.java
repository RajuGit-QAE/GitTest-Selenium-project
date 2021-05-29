package com.herokuapp.theinternet;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTestDataprovider {
  @Test(dataProvider="credentials")
  public void f(String username, String password) {
	  
	  System.out.println(username);
	  System.out.println(password);
  }
  @DataProvider(name = "credentials")
  
  public Object [][] getdata(){
	  
	  Object[][] data = new Object [3][2];
	  
	  data[0][0] = "tomsmith";
	  data[0][1] = "SuperSecretPassword!";
	  
	  data[1][0] = "tomsmiith";
	  data[1][1] = "SuperSecretPassworrd!";
	  
	  data[1][0] = "tomsmiithh";
	  data[1][1] = "SuperSecretPassworrd!!";
	  
	  
	  return data;
	  
	  
	  
	  
	  
  }
}
