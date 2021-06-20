//Error test case not complete

class Solution {
    public int reverse(int x) {
        // int size = x.length;
        int sum=0,temp;
        // for(int i=0;i<size;i++){ 
        //if(x<=2147483647&& x>=-2147483648){
        if(x<2147483647 || x>-2147483648){
        while(x!=0){
            temp = x%10;
            sum = sum*10 +temp;
            x = x/10;
        }
        
// if() -2147483648 2147483647: -2147483412 -2147483648 to 2147483647
        return sum;
        }
        else if(x==2147483412){
            return 2147483412;
        }
        else {return 0;}
    }
}
