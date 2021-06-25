class Solution {
    public boolean isAnagram(String s, String t) {
        int temps = s.length();
        int tempt = t.length();
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        String str1 = new String(arr1);
        String str2 = new String(arr2);
        
        if(str1.equals(str2))
            return true;
        return false;
    }
}
