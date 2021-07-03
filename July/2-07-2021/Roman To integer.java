class Solution {
    //pahele mai isko switch case se ker rha tha but yeah method jyda simple hai...
    
    public int romanToInt(String s) {
       int num = 0;
        int n = s.length();
            
        for(int i=0; i<n-1; i++){
            if(value(s.charAt(i))<value(s.charAt(i+1))){
                num -= value(s.charAt(i));
            } else {
                num += value(s.charAt(i));
            }
        }
        num += value(s.charAt(n-1));
        return num;
    }
    
    int value(char c){
        if(c=='I') return 1;
        if(c=='V') return 5;
        if(c=='X') return 10;
        if(c=='L') return 50;
        if(c=='C') return 100;
        if(c=='D') return 500;
        if(c=='M') return 1000;
        return 0;
    
    }
}
