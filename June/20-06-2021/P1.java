class Solution {
    public int[] twoSum(int[] nums, int target) {
       // int size = target;
        int temp ;
       // int[2] fr;
        for(int i=0;i<nums.length;i++){  
            //shorting vala method se i+1 ka use kiyaa
            for(int j=i+1;j<nums.length;j++){
                temp = nums[i]+nums[j];
              if(temp==target){  
                    //System.out.println(i+","+j);
                return new int[] {i,j};
              }
                temp = 0;
              //  fr[0]=i;
                //fr[1]=j;
                //return i,j;
                   // return ((nums[i])(nums[j])
                //  return ;
            }
            //System.out.println(nums[i]);
        }
        // return forreturn;
      //  return fr;
      throw new IllegalArgumentException("retruned");
    }
}
