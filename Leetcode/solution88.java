package Leetcode;

public class solution88 {
    public static void merge(int[]nums1 , int m , int[] nums2 , int n ){

        for (int i = 0 ; i < m - n ; i ++ ){
            if (nums1[i] > nums2[0]){
                int temp = nums1[i] ; 
                nums1[i] = nums2[0] ; 
            }
        }
    } 
    public static void main (String args[]){
        int[] nums1 = {1,2,3,0,0,0} ; 
        int m = nums1.length ; 
        int[] nums2 = {2,5,6} ; 
        int n = nums2.length ; 
        merge(nums1, m, nums2, n);
    }
}
