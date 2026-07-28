class Solution {
    public int maxArea(int[] heights) {

        int low =0;
        int high = heights.length-1;
        int maxArea = 0;
        int area = 0; //diff of pointers  * lowest of the 2 pointers

        while(low<high)
        {
            
            int diff = high - low;

            area  = diff * Math.min(heights[low],heights[high]);

            maxArea = Math.max(area,maxArea);
            if(heights[low] < heights[high])
            {
                low++;
            }
            else
            {
                high--;
            }

        }
        return maxArea;
    }

    private int lowest(int a, int b)
    {
        if( a > b)
        {
            return b;
        }
        return a;
    }
}
