class Solution {
    public boolean isPowerOfTwo(int n) {
        // int temp,val=n;
        // static int power=0;
        // for(int i=0;i<n;i++){
        //     temp = val/2;
        //     if(temp == 1){
        //         power = 1;
        //         // System.out.println("true");
        //         break;
        //     }
        //     val = temp;
        //     System.out.println("true");
        // }
        // if(power == 1){
        //     return true;
        // }
        // else return false;
        // // return false;
         if(n == 0) return false;
    
    
        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1)
            return true;

        return false;
    }
}
