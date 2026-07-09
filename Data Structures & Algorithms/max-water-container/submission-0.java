class Solution {
    public int maxArea(int[] heights) {
        int n =heights.length;
 int left=0;
 int right=n-1;
 int currans=0;
int maxarea=0;
 while(left<right){
   int width=right-left;
   int hei=Math.min(heights[left],heights[right]);
    currans=width*hei;
maxarea=Math.max(currans,maxarea);
   if (heights[left] < heights[right]) {
    left++;
} else {
    right--;
}
 }
 return maxarea;
    }
}

