/*
    633
    Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

 

Example 1:

Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:

Input: c = 3
Output: false
 */


public class SumOfSquareNumbers {
    class Solution {
        public boolean judgeSquareSum(int c) {
           int left = 0;
           long right = (long) Math.sqrt(c);
           while(left<=right){
               long sum = left * left + right * right;
               if(sum == c){
                   return true;
               }
               else if (sum < c){
                   left++;
               }
               else {
                   right--;
               }
    
           }
           return false;
        }
    }
    public static void main(String[] args) {
        
    }
}
