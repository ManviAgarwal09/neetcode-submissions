class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>hp=new HashMap<>();
        int maxwin=0;
        int l=0;
        int maxf=0;
        for(int i=0;i<s.length();i++){
            hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
            maxf=Math.max(maxf,hp.get(s.charAt(i)));
            while(i-l+1-maxf>k){
                hp.put(s.charAt(l),hp.get(s.charAt(l))-1);
                l++;
            }
        maxwin=Math.max(maxwin,i-l+1);
        }
    
    return  maxwin;
}
}