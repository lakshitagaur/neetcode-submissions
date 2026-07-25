class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        int low = 1;
        int high = max(piles,max);
        int valid = 0;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(checkWithinHours(piles,h,mid))
            {
                valid  = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }

        }

        return valid;

    }

    private int max(int [] nums,int max)
    {
        for(int num:nums)
        {
            if(num > max)
            {
                max = num;
            }
        }

        return max;
    }

    private boolean checkWithinHours(int[] nums, int h, int div)
    {
        int sum =0;
        for(int num:nums)
        {
            sum += (num + div -1 )/div;
        }

        if(sum <= h)
        {
            return true;
        }
        return false;
    }
}
