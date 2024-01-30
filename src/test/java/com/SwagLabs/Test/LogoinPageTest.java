package com.SwagLabs.Test;

import org.testng.annotations.Test;

public class LogoinPageTest extends BaseClass
{
  @Test
  public void verifyAppTitle() 
  {
	  lp.getAppTitle();;
  }
  
}
