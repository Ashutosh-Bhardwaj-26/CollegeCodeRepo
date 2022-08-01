package DP;
import java.util.*;

public class LCS {

	public static void main(String[] args) {
		//Longest Common Subsequence
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter both the Strings");
		String s1 = sc.nextLine();
 		String s2 = sc.nextLine();
 		
 		int m = s1.length();
 		int n = s2.length();
 		
 		int memo[][] = new int[m+1][n+1];		
		for(int i =0;i<m+1;i++) {
			for(int j =0;j<n+1;j++) {
				memo[i][j] = -1;
			}
		}
		
		int k = lcs(s1,s2,m,n,memo);
		System.out.println(k);
	
		//findLSA()
		
	}
	
	static int lcs(String s1,String s2,int m,int n,int[][] memo) {
		if(memo[m][n] != -1) {
			return memo[m][n];
		}
		if(m==0 || n==0) {return 0;}

		if(s1.charAt(m-1) == s2.charAt(n-1)) {
			memo[m][n] = 1 + lcs(s1,s2,m-1,n-1,memo);
			return memo[m][n];
		}
		memo[m][n] = Math.max(lcs(s1,s2,m-1,n,memo), lcs(s1,s2,m,n-1,memo));
		return memo[m][n];
	}

}
