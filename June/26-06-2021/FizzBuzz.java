class Solution {
    public List<String> fizzBuzz(int n) {
        int temp = n;
        // String[] str = new String[20];
        ArrayList<String> arr=new ArrayList<String>();
        
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                // arr[i] = "FizzBuss";
                arr.add("FizzBuzz");
            }
            else if(i%3==0)
                // arr[i] = "Fizz";
                arr.add("Fizz");
            else if(i%5==0)
                // arr[i] = "Buss";
                arr.add("Buzz");
            else
                // arr[i] = Integer.toString(i);
                arr.add(String.valueOf(i));
        }
      
        return arr;
        // throw new IllegalArgumentException("Hi");
    }
}
