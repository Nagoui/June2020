class Solution {
    public int hammingDistance(int x, int y) {
        int a = x,b=y;
       
        int binaryx[] = new int[40];
        int indexx = 0,count=0;
        while(x>0){
            binaryx[indexx++] = x%2;
            x = x/2;
        }
        for(int i =indexx-1;i>=0;i--)
            System.out.print(binaryx[i]);
        
        
        System.out.println();
        int binary[] = new int[40];
        int index = 0;
        while(y>0){
            binary[index++] = y%2;
            y = y/2;
        }
         for(int i =index-1;i>=0;i--)
            System.out.print(binary[i]);
      
        for(int j =40-1;j>=0;j--){
            if(binaryx[j]!=binary[j])
                count++;
            }
         
        return count;
    }
}
