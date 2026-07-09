class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[]s11count=new int[26];
        int[]s22count=new int[26];
        for(int i=0;i<s1.length();i++){
            s11count[s1.charAt(i)-'a']++;
         
        }
      
        for(int i=0;i<s2.length();i++){
               s22count[s2.charAt(i)-'a']++;
               if(i>=s1.length()){
                s22count[s2.charAt(i-s1.length())-'a']--;

               }
               if (matches(s11count, s22count)) {
                return true;
        }

        }
        return false;
    }
    private boolean matches(int[]a,int[]b){
                for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
    
 