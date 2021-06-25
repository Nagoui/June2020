class Solution {
    public int[] countBits(int n) {
        // int val = n;
        int[] arr=new int[n+1];
        // int index = 0,l,m,count=0;
        for(int k=0;k<=n;k++){
            arr[k]= convert(k);
      
        }
        return arr;
        // throw new IllegalArgumentException("The filename cannot be null!");
    }
    public int convert(int a){
        int binary[] = new int[40];
        int sum=0,index=0;
         while(a>0){
                binary[index++] = a%2;
                a = a/2;
            }
            for(int i=index-1;i>=0;i--){
                if(binary[i]==1){
                    // ++count;
                    sum = sum+1;
                }
//                 System.out.print(count+" ");
               
                // System.out.println(binary[i]);
            } 
        return sum;
    }
    
}
