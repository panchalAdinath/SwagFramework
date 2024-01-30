package com.SwagLabs.Test;

import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
  @Test
  public void verifyAddProductToCart() 
  {
	  ip.addProductToCart();
  }
}
