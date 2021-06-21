//Yeah solve to hua but iske lgic me thoda dout hai ki kaise ho rha solve
class Solution {
    public int climbStairs(int n) {
        int a=0,b=1,temp;
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else{
            for(int i=0;i<n;i++){
                temp = a + b;
                a = b;
                b = temp;
            }
    }
        return b;
    }
}
