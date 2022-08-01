package greedy;

import java.util.*;

public class ActivitySelection {
	static Activity arr[];
	ActivitySelection(int n) {
		arr  = new Activity[n];
	}
	static class Activity{
		public int  start;
		public int finish;
		public Activity(int start, int finish) {
			this.start = start;
			this.finish = finish; 	
		}
		
	}
	
//	static class MyCmp implements Comparator<Activity>{
//		@Override
//		public int compare(Activity a1,Activity a2) {
//			return a1.finish - a2.finish;
//		}
//
//		
//	}
	
	public static int maxActivity(){
		Arrays.sort(arr, new Comparator<Activity>()
        {
            @Override
            public int compare(Activity s1, Activity s2)
            {
              return s1.finish - s2.finish;
            }
         });
		int res = 1; // the minimum time taken activity is already selected 
		int prev = 0;
		for(int cur = 1;cur<arr.length;cur++) {
			{
				if(arr[cur].start>= arr[prev].finish) {
					res ++;
					prev = cur; 
				}
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		ActivitySelection as = new ActivitySelection(n);
		
		for(int i =0;i<n;i++) {
			arr[i] = new Activity(sc.nextInt(),sc.nextInt());
		}
		
		System.out.println(maxActivity());
		

	}

}
