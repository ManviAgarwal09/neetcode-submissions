class Solution {
    public int leastInterval(char[] tasks, int n) {
    HashMap<Character,Integer>hp= new HashMap<>();
    for(char t:tasks){
        hp.put(t,hp.getOrDefault(t,0)+1);

    }
    int maxfreq=0;
    for(char t:tasks ){
        maxfreq=Math.max(maxfreq,hp.get(t));
    }
        int maxfreqcount=0;
        for(int t:hp.values()){
            if(t==maxfreq){
            maxfreqcount++;}
        }
    
    int chunks=maxfreq-1;
    int chunksize=n+1;
    int frame=(chunks*chunksize)+maxfreqcount;
    return Math.max(tasks.length,frame);
}
}
