class Solution {
    public int maxProfit(int[] prices) {
    int n= prices.length;
    int max=0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<n;j++){
                 int w=prices[j]-prices[i];
                if(w>max){
                    max=w;
                }
            }

            
            }
     return max;    
}
}