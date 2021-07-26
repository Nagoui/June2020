class Solution {
    public char findTheDifference(String s, String t) {
        //toCharArray us use for convert String into character array
        //matlab ke jaise "hello" ko convert kerta hai 'h','e','l','l','o';
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        
        //yeah niche vala method character array ko short kerdega
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        //array one ke length tak chelega
        for(int i=0;i<ch1.length;i++){
            //if vale case me array one and array two ko character by character match kerega
            if(ch1[i]!=ch2[i]){
                return ch2[i];
            }
        }
        return ch2[ch2.length-1];
    }
}
