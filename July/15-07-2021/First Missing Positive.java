class Solution {
//     public int firstMissingPositive(int[] arr) {
//         int value = 0;
  
//         for (int i = 0; i < arr.length; i++)   
//         {  
//         for (int j = i + 1; j < arr.length; j++)   
//         {  
//         int tmp = 0;  
//         if (arr[i] > arr[j])   
//         {  
//         tmp = arr[i];  
//         arr[i] = arr[j];  
//         arr[j] = tmp;  
//         }  
//         }  
//         //prints the sorted element of the array  
//         // System.out.println(arr[i]);  
//             value = arr[i];
//         }  
//        // System.out.println(value);
//         // int value = arr[arr.length-1];
//         // // System.out.println(arr[arr.length-1]);
//         for(int i=1;i<=value;i++){
//             if(i!=arr[i]){
//                  // System.out.println(i);
//                 return i;
//                 // break;
//             }
//             if(arr[i]==0){
//                 System.out.println(value+1);
//             }
//         }
//         // return 0;
//         new IllegalArgumentException("aaaise he");
//     }
    
    public int firstMissingPositive(int[] nums) {        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums.length) {
                nums[i] = 0;
            }
        }
        int[] num = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0) {
                continue;
            } else {
                num[nums[i]]++;
            }
        }
        int i = 0;
        for(i = 1; i < num.length; i++) {
            if(num[i] == 0) {
                return i;
            }
        }
        
        return num.length;
    }
}
