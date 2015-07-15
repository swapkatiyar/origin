package ca.fresher;
import java.util.Stack;

public class rpn {
	int result = 0;

	public int checksum(String str) {
		// TODO Auto-generated method stub
		result = 0;
		String str1[] = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			result = Integer.parseInt(str1[0]) + Integer.parseInt(str1[1]);
		}
		return result;
	}

	public int checksum1(String str) {
		// TODO Auto-generated method stub
		
		int result = 0;
		String str1[] = str.split(" ");
		Stack<String> stc = new Stack<String>();
		for (int i = 0; i < str1.length; i++) {
			/*if(!str1[i].equals("+")||!str1[i].equals("-")||!str1[i].equals("*")||!str1[i].equals("/")) {
				System.out.print("hi ");
				stc.push(str1[i]);
			}
		*/
				
				if (str1[i].equals("+")) {
				result = 0;
				int rs1 = Integer.parseInt(stc.pop());
				int rs2 = Integer.parseInt(stc.pop());
				result = rs1 + rs2;
				System.out.println(result);
				stc.push(Integer.toString(result));
				
			} 
				else if (str1[i].equals("-"))
			{
				result = 0;
				int rs1 = Integer.parseInt(stc.pop());
				int rs2 = Integer.parseInt(stc.pop());
				result = rs2 - rs1;
				stc.push(Integer.toString(result));
		}
			
				else if (str1[i].equals("*"))
			{
				result = 0;
				int rs1 = Integer.parseInt(stc.pop());
				int rs2 = Integer.parseInt(stc.pop());
				result = rs1 * rs2;
				stc.push(Integer.toString(result));
		}
			
				else if (str1[i].equals("/"))
			{
				result = 0;
				int rs1 = Integer.parseInt(stc.pop());
				int rs2 = Integer.parseInt(stc.pop());
				result = rs2 / rs1;
				stc.push(Integer.toString(result));
		}
					 
		else stc.push(str1[i]);

		}
		//System.out.println( Integer.parseInt(stc.pop()));
		return Integer.parseInt(stc.pop());

		}

			
			
			
	public boolean checkepmty(String str) {
		// TODO Auto-generated method stub
		if (str.isEmpty());
		return true;
	}

}
