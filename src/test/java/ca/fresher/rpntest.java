package rpncal;


import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;
import ca.freshers.rpnrefactored;



public class rpntest extends TestCase{
	

	@Test
	public void testcheksum()
	{ String str="34 34 +"; 
	rpnrefactored rpn1 =new rpnrefactored();
		Assert.assertEquals(68,rpn1.checksum(str));
	}
		@Test
	public void testcheksum1()
	{ 
			String str="6 2 * 3 /"; 
	rpnrefactored rpn1 =new rpnrefactored();
	Assert.assertEquals(4,rpn1.checksum1(str));
	}
	
	boolean emp=true;
	@Test
	public void testchekempty()
	{ 
		String str=""; 
		rpnrefactored rpn1 =new rpnrefactored();
		Assert.assertEquals(emp,rpn1.checkepmty(str));
		System.out.println("Empty String");
		}

	


}
