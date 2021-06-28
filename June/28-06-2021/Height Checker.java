class Solution {
    public int heightChecker(int[] heights) {
        
        int[] arr = new int[heights.length];
        for(int k=0;k<arr.length;k++){
            arr[k] = heights[k];
        }
        
        int temp,count=0;
        for(int i = 0;i<heights.length;i++){
            for(int j=0;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    temp = heights[i];
                    heights[i] = heights[j];
                    heights[j]= temp;
                }
            }
        }
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i]){ 
                count++;
            }
           
        }
