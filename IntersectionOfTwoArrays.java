/*
    349. Intersection of Two Arrays
    Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


 */


public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        for (int i : nums1) {
            temp[i] = 1;
        }
        int count = 0;
        for (int i : nums2) {
            if (temp[i] == 1) {
                count++;
                temp[i] = 2;
            }
        }
        int arr[] = new int[count];
        int j = 0;
        for (int i : nums2) {
            if (temp[i] == 2) {
                temp[i] = 1;
                arr[j] = i;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        
    }
    
}
