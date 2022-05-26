package heap;
import java.util.*;
import sorting.Swap;

public class MinHeap{
	Swap s = new Swap();
	int arr[];
	int size;
	int capacity;
	
	MinHeap(int c){
		arr = new int[c];
		size = 0;
		capacity = c;
	}
	int[] insert(int x){
		size++;
		//if(size==capacity+1) return arr;
		arr[size-1] =  x;
		int i = size-1;
		while(i>0) {
			int parent = (i-1)/2;
			if(arr[parent]>arr[i]) {	
				s.swap(arr,parent,i);
				i = parent;
			}else {
				return arr;
			}
		}
		return arr;
	}
	
}
