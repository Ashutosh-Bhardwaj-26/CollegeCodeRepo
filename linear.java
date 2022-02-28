import java.util.*;
class linear {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list  = new ArrayList<>(); 
        
        
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
          for(int j=0;j<n;j++){
            list.add(sc.nextInt());
          }
          System.out.println("Enter the key to find");
          int k = sc.nextInt();
          linear_search(list,k);

        }          
           
        sc.close();
    }

    private static void linear_search(ArrayList<Integer> list,int k){
        int flag = 0;
        for(int i =0;i<list.size();i++){
            if(list.get(i)==k){
                System.out.println("Element present");
                System.err.println("index = " + i);
                System.out.println("Comperisons = " + i+1);
                flag =1;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
            System.out.println(list.size());
        }
    }

}