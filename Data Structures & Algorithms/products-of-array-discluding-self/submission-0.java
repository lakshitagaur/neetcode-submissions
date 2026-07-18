class Solution {
    public int[] productExceptSelf(int[] nums) {

        int k = 0;
        int product = 1;
         
        int[] array = new int[nums.length];
 
 while(k<nums.length)
 {
        for(int i=0;i<nums.length; i++)
        { 
            if(i == k)
            {
                continue;
            }
            product *= nums[i];
            
        }
        array[k] = product;
        product = 1;
        k++;
 }
        return array;
    }
}  
