//package stack;
//
//import java.util.*;
//
//public class KstackArray {
//	
//	int arr[],next[],top[];
//	int k,freeTop,cap;
//	
//	
//
//	public KstackArray(int k,int n) {
//		super();
//		this.arr = new int[n];
//		this.next = new int[n];
//		this.top = new int[k];
//		this.k = k;
//		this.freeTop = 0;
//		this.cap = n;
//		
//		//for k =3 -- top = {-1,-1,-1}
//		for(int  i=0;i<k;i++) {
//			top[i]  =-1;
//		}
//		
//		//for n =6 -- next = {1,2,3,4,5,-1}
//		for(int i =0;i<n;i++) {
//			next[i] = i+1;
//			next[cap-1] = -1;
//		}
//	}
//	
//	
//	void push(int x,int sn) {
//		int i = freeTop;
//		freeTop = next[i];
//		next[i] = top[sn];
//		top[sn] = i;
//		arr[i] = x;
//	}
//	
//	int pop(int sn) {
//		int i = top[sn];
//		top[sn] = next[i];
//		next[i] = freeTop;
//		freeTop = i;
//		return arr[i];
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("\t\t\t K- Stack Array");
//		System.out.println("Enter the capacity and total stack:-");
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		KstackArray st = new KstackArray(n,k);
//		
//		System.out.println("Enter the element and the stack value");
//		for(int i =0;i<n;i++) {
//			int x = sc.nextInt();
//			if(x==-1) {
//				break;
//			}
//			int sn = sc.nextInt();
//			st.push(x,sn);
//		
//		}
//		
//		System.out.println("Enter the value of sn");
//		for(int i =0;i<n;i++) {
//			int sn = sc.nextInt();
//			if(sn==-12) {
//				break;
//			}
//			st.pop(sn);
//		}
//	}
//
//}
