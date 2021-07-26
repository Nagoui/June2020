class Solution {
    public int[] plusOne(int[] digits) {
        //yaha pe jo digits variable ke through array aaya hai uski humne length ko n me dal diyaa
        int n=digits.length;
        
        
        //phir yaha humne ek reverse loop chalaya matlab ke n-1 last value se 0 tak jayega; 
        for(int i=n-1;i>=0;i--){
            
            //isme array ke jo last value hoga agr vo 9 se chota hoga kyuki question me diyaa hai ki array ki last digit ko el increase kerna hai to agr 9 hua to ek increase ho jayega n to array out of bound exception aajayega n ise liuea 8 tak chelega to increase hoke 9 ho jayega;
            if(digits[i]<9){
                digits[i]++;
                //yaha pe sirg ek last vali ko increase kerke loop se baher
                return digits;
            }
            //[2,2,9]
            //is line me agr last digit 9 hai to usko 0 kerk dega
            // matlab ki=>  [2,2,0];
            digits[i] = 0;
        }
        //yaha pe just array ki size ek increase ho rha 
        int[] tempArray = new int[n+1];
        //or jo array 0 vali position the vaha pe 1 dal diyaa...
        tempArray[0] = 1;
        
        return tempArray;
    }
}
