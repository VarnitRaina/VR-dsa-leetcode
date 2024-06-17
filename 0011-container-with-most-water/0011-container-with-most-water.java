class Solution {
    public int maxArea(int[] height) {
        int count=0;
        int area=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int right=Math.min(height[l], height[r]);
            area=Math.max(area,(r-l)*right);   
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
}