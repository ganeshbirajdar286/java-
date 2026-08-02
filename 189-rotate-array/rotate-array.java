class Solution {
         
      public void rotate_array(int []nums,int a ,int b){


       while(a<b){
             int temp = nums[a];
nums[a] = nums[b];
nums[b] = temp;
   a++;
   b--;
        }
           
      }



    public void rotate(int[] nums, int k) {
           int  n =nums.length;
             k %= n;
           rotate_array(nums ,0,n-1);
           rotate_array( nums ,0,k-1);
           rotate_array(nums,k,n-1);
    }
}