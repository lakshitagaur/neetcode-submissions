class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> output = new ArrayList<>();
     for(int k=0; k<nums.length - 2;k++)
     {  if(k!=0 && (nums[k-1]==nums[k]))
     {
        continue;
     }
        int i = k+1;
        int j = nums.length-1;


        while(i < j)
        {
            int sum = nums[k] + nums[j] + nums[i];
            if(sum == 0)
            { 
                   output.add(List.of(nums[k], nums[j], nums[i]));
                   i++;
                   j--;
                   while(i < j && nums[i] == nums[i - 1])
{
    i++;
}
while(i < j && nums[j] == nums[j + 1])
{
    j--;
}
                
                   
             }
            else if (sum > 0 )
            {
                j--;
            }
            else
            {
                i++;
            }
        }
     }
     
        return output;
    }
}