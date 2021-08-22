package Sliding_window;

import java.util.LinkedList;
import java.util.Queue;

public class first_negative_no_in_window_size_k {
    public static void main(String[] args) {
        int a[] = {12, -1, -7, 8, -15, 30, 16, 28};
        Queue<Integer> qu = new LinkedList<>();
        int k = 3;
//        for (int i = 0; i < a.length - k + 1; i++)
//        {
//            int flag = 0;
//            for (int j = i; j < i + k; j++) {
//                if (a[j] < 0){
//                    flag = 1;
//                    System.out.print(a[j]+" ");
//                    break;
//                }
//            }
//            if (flag == 0){
//                System.out.print(0+" ");
//            }
//
////            System.out.println();
//        } brute force approach
        int i=0;
        int j=0;
        while (j<a.length) {
            if (a[j] < 0) {
                qu.offer(a[j]);
            }
            if (j - i + 1 < k) {
                j++;
            }
            else if(j-i+1 == k){
//                 int flag = 0;
//                 for(int ind=i;ind<j;ind++){
//                     if(a[ind]<0){
//                         flag = 1;
//                         System.out.print(a[ind]+" ");
//                         break;
//                     }
//                 }
//                 if (flag == 0)
//                     System.out.print(0+" ");
//                 i++;
//                 j++;
                 if(qu.size() == 0){
                     System.out.print(0+" ");
                 }
                 else{
                     System.out.print(qu.peek()+" ");
                     if(a[i] == qu.peek()){
                         qu.poll();
                     }
                 }

                i++;
                j++;
             }

        }

    }
}



