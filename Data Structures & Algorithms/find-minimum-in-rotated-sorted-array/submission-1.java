class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = 0;
        

        while(low<=high)
        {
           int mid = low+(high-low)/2;
           System.out.println("mid: "+ mid);

           if(nums[low] <= nums[high])
           {
            return nums[low];
           }
           
           else if (nums[low]<=nums[mid])
           {
              low = mid +1;
           }

           else
           {
            high = mid;
           }

        }

        return -1;

    }
}
