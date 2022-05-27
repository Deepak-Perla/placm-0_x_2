//<--------------method 1--------------->

//package arrays;
//
//import java.util.Arrays;
//
//public class adding_arrays {
//
//    public static void main(String[] args) {
//        int arr1[] = {12,34,200};
//        int arr2[] = {55,67,562};
//        int arr3[] = {0,00,0000};
//
//        int length = arr1.length+arr2.length+arr3.length;
//        int result[] =  new int[length];
//        int pos=0;
//
//        for( int i:arr1 ){
//            result[pos]=i;
//            pos++;
//        }
//
//        for(int i: arr2){
//            result[pos]=i;
//            pos++;
//        }
//
//        for(int i: arr3){
//            result[pos]=i;
//            pos++;
//        }
//
//        System.out.println(Arrays.toString(result));
//
//    }
//
//}


//<--------------method 2--------------->
package arrays;

import java.util.Arrays;

public class adding_arrays {
    public static void main(String[] args) {
        int arr1[]={8,9,0,1};
        int arr2[]={2,3,4,5};

        int merge[]=new int[arr1.length+arr2.length];

        int c=0;
        for(int i=0; i< arr1.length; i++){
            merge[i]=arr1[i];
            c++;
        }
        for(int j=0; j<arr2.length; j++){
            merge[c++]=arr2[j];
        }
        for(int i=0; i<merge.length; i++){
            System.out.print(merge[i]+" ");
        }
    }
}


















