package ca.fresher;

// testing bakar

import java.util.Stack;

public class rpnrefactored {
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
			
			if (isOperator(str1[i]))
			{
				result = 0;
				int rs1 = Integer.parseInt(stc.pop());
				int rs2 = Integer.parseInt(stc.pop());
				if (str1[i].equals("+"))
				result = rs1 + rs2;
				else if (str1[i].equals("-"))
					result = rs2 - rs1;
				else if (str1[i].equals("*"))
					result = rs1 * rs2;
				else if (str1[i].equals("/"))
					{
					if(rs2==0)
					System.out.println("Divide by zero error");
					else
						result = rs2 / rs1;
					}
				
					
					
				System.out.println(result);
				stc.push(Integer.toString(result));
				
			}
			else 
			{
				stc.push(str1[i]);
			}
		}
			return Integer.parseInt(stc.pop());

		}

			
			
			
	private boolean isOperator(String str1) {
		if(str1.equals("+")||str1.equals("-")||str1.equals("*")||str1.equals("/"))
		return true;
		else 
			return false;
		
	}

	public boolean checkepmty(String str) {
		// TODO Auto-generated method stub
		if (str.isEmpty());
		return true;
	}



}

