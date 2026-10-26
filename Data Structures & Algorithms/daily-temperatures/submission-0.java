class pair{
    int temp;
    int index;
    pair(int temp,int index){
        this.temp =temp;
        this.index=index;
    }

}


class Solution {
    public int[] dailyTemperatures(int[] temperatures){
                Stack<pair> st=new Stack<>();
     
        int n=temperatures.length;
        int result[]=new int[n];
       for(int i=n-1;i>=0;i--)
        {
        
            while(!st.isEmpty()&& st.peek().temp<=temperatures[i]){
              st.pop();

            }
            if(!st.isEmpty()){
                result[i]=st.peek().index-i;
            }
            else{
                result[i]=0;
            }
            st.push(new pair(temperatures[i],i));
        }
    
        return result;
}
}
    
       