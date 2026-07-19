class Solution {
    public int search(int[] nums, int target) {
        //divide array into two halves , if the left half is sorted and the number lies within the sorted half then
        // high will be mid-1 
        // and if it does not lie in the left half then low will be mid+ 1 and we will search the array 


        int low = 0;
        int high = nums.length -1 ;

        while(low<=high)
        {
            int mid  = low + (high-low)/2;   
            System.out.println(mid);

            if(nums[mid] == target)
            {
                return mid;
            }

            else if (nums[low] <= nums[mid] )
            { if(target < nums[mid] && target >= nums[low])    
            { 
                high = mid-1;  
            }
            else
            {
                low = mid+1;
            }
            }

            else
            {
                if(target > nums[mid] && target < nums[low])
                {
                    low= mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }

        }
       return -1;
    }
}
