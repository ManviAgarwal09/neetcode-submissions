class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character>hp=new HashSet<>();
        int l=0;
        int res=0;

        for(int i=0;i<s.length();i++){
           while(hp.contains(s.charAt(i))){
            hp.remove(s.charAt(l));
            l++;
           }
        hp.add(s.charAt(i));
        res=Math.max(res,i-l+1);
    }  
    return res;
}
}
