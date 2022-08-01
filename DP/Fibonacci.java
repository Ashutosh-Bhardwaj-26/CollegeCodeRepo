package DP;

import java.util.*;

public class Fibonacci {
	
	static int memo[];
	
	Fibonacci(int n){
		memo = new int[n+1];
		for(int i =0;i<n+1;i++) {
			memo[i] = -1;
		}
		//Arrays.fill(memo, -1);
	}
	
	
	static int fabMemo(int n) {
		if(memo[n]==-1) {
			int res;
			if(n==0 || n==1) {
				res = n;
			}else {
				res = fabMemo(n-1)+fabMemo(n-2);
			}
			memo[n] = res;
		}
		return memo[n];
		
	}
	
	
	static int fab(int n) {
		if(n==0 || n==1) {
			return n;
			
		}else {
			return fab(n-1)+fab(n-2);
		}
		
	}
	

	public static void main(String[] args) {
		
		
		
		//System.out.println(fab(4));
		
		Fibonacci f = new Fibonacci(4);
		System.out.println(fabMemo(4));
		
	}

}
