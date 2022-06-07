package sorting;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int []arr1 = {10,20,80,100,50};
        int []arr2 = {15,20,25,40,90};
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int []arr1, int []arr2) {
        int mid = (s+e)/2;
        int[]p1=sort(arr,s,mid);
        int[]p2=sort(arr,mid+1,e);
        return merge(p1,p2);


    }
}
