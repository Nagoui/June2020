class Solution {
    public String sortSentence(String s) {
    String ans= "";
    
    String arr[]=s.split(" ");     //jaha jaha gap hai vaha se split ker ke array me dal diyaa
        
String temp;

    for(int i=0;i<arr.length;i++){
    
        for(int j=i+1;j<arr.length;j++){
            
      
     char firstNumber=arr[i].charAt(arr[i].length()-1);  //last character jo number hai usko nikal ke 
            
      char  secondNumber=arr[j].charAt(arr[j].length()-1);  
            
            
         if( firstNumber>secondNumber){ //yaha pe comparee kerke bubble short ke through arrange kiyaa  
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
         }
        }  
    }  
        
      //iske niche ka samajh nhi aa rha tha...
    
        
        for(int i=0;i<arr.length;i++){
            
            
     String word =arr[i].substring(0, arr[i].length()-1);  
            
            ans=ans+" "+ word;
            
ans = ans.replaceFirst("^\\s*", "");  // this line is the remove the white space at the begining of ans 
                     
        }
          
        return ans;

    }
}
