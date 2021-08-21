package Sliding_window;

import java.util.Scanner;

public class maxsum_of_subarray_size_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {2,5,1,8,2,9,1};
        int i=0;
        int j=0;
        int k = sc.nextInt();
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        while(j<a.length){
            sum+=a[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxsum = Math.max(sum,maxsum);
                sum-=a[i];
                j++;
                i++;
            }

        }
        System.out.println(maxsum);

    }
}
