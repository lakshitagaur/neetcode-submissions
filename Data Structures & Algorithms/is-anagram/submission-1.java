class Solution {
    public boolean isAnagram(String s, String t) {
            Map<Character,Integer> cMap1 = new HashMap();
            Map<Character,Integer> cMap2 = new HashMap();


            if(s.length()!= t.length())
            {
                return false;
            }
            
            for(int i = 0;i<s.length();i++)
            {
                cMap1.put(s.charAt(i),cMap1.getOrDefault(s.charAt(i),0)+1);
            }

            for(int i = 0;i<t.length();i++)
            {
                cMap2.put(t.charAt(i),cMap2.getOrDefault(t.charAt(i),0)+1);
            }
            System.out.println(cMap1);
            System.out.println(cMap2);

      return cMap1.equals(cMap2); 



          



    }
}
