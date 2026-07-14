class Solution {
    public boolean isPalindrome(String s) {
        int low=0;
        int high = s.length()-1;
        boolean flag= true;
        String lower = s.toLowerCase();

        while(low<high && flag==true)
        {
             if(!Character.isLetterOrDigit(lower.charAt(low)))
             {
                low++;
                continue;
             }
             if(!Character.isLetterOrDigit(lower.charAt(high)))
             {
                high--;
                continue;
             }
            if(lower.charAt(low)==lower.charAt(high))
            { 
                low++;
                high--;
            }
            else
            {
                flag= false;
                return flag;
            }
            
        }
       
        return flag;
        
    }
}