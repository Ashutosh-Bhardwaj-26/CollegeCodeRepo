import java.util.*;

class bubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> bs = new ArrayList<>();
        int n = sc.nextInt();

        for(int i =0;i<n;i++){
            bs.add(sc.nextInt());
        }

            for (int j = 0; j < n-i-1; j++)
                if (bs.get(j) > bs.get(j+1))
                {
                    // swap arr[j+1] and arr[j]
                    int temp = bs.get(j);
                    bs.set(j,bs.get(j+1));
                    bs.set(j+1,temp);
                }
        sc.close();

        System.out.println(bs);

    }
}   