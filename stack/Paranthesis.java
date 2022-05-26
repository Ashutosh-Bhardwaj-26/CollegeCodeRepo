package stack;

import java.util.*;

public class Paranthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		ArrayDeque<Character> st = new ArrayDeque<>();
		
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) == '(' || s.charAt(i)=='{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			}
			else {
				if(st.isEmpty()==true) { 
					System.out.println("no");
					break;
				}
				else if(matching(st.peek(),s.charAt(i))==false) { 
					System.out.println("no"); 
					break;
				}
				else {
					st.pop();
				}
			}
		}
		
		if(st.isEmpty()==true) System.out.println("yes");

	}
	
	static boolean matching(char a,char b) {
		return 	(a == '(' && b == ')') || (a == '{' && b== '}') || (a == '[' && b == ']');
	}

}
