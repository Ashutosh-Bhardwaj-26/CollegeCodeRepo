package stack;
import java.util.*; 


public final class LargestRectangle {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> s = new ArrayDeque<>();
		
		System.out.println("Enter The Array size:-");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int ps[] = new int[n];
		int ns[] = new int[n];
		ps[0] = -1;
		
		
		s.push(0);
		//previous smaller
		for(int i =1;i<n;i++) {
			while(s.isEmpty()==false && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			//imp
			int k = s.isEmpty()?-1:s.peek();
			ps[i]=k;
			s.push(i);
		}
		
		s.clear();
		
		s.push(n-1);
		ns[n-1] = n;
		//next smaller
		for(int i =n-2;i>=0;i--) {
			while(s.isEmpty()==false && arr[s.peek()]>arr[i]) {
				s.pop();
			}
			//imp
			int k = s.isEmpty()?n:s.peek();	
			ns[i]=k;
			s.push(i);
		}
		
		for(int i : ps)
		System.out.println(i);
		
		for(int i : ns)
			System.out.println(i);
		
		
		int res =0;
		for(int i =0;i<n;i++) {
			int cur = arr[i];
			cur += (i -ps[i] -1)*arr[i];
			cur += (ns[i] - i -1)*arr[i];
			res = Math.max(cur, res);
		}
		System.out.println(res);
		
		
	}

}
