class Solution {
    public int subtractProductAndSum(int n) {
        int temp,val,sum=0,mul=1,m=n;
        while(n>0){
            temp = n%10;
            mul = mul*temp;
            n = n / 10;
        }
        
        while(m>0){
            val = m%10;
            sum = sum+val;
            m = m / 10;
        }
        
        int result = mul - sum;
        
        return result;
    }
}
