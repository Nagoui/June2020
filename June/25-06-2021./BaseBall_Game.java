class Solution {
    public int calPoints(String[] ops) {
        Stack <Integer> obj = new Stack<>();
        int sum = 0;
        for(int i = 0;i<ops.length;i++){
        if(ops[i].equals("C")){
                obj.pop();
        }
        else if(ops[i].equals("D")){
            obj.push(2*obj.peek());
        }
        else if(ops[i].equals("+")){ 
            int first = obj.pop();
            int second = obj.peek();
            
            obj.push(first);
            obj.push(first+second);
        }
        else{
            int val = Integer.parseInt(ops[i]);  
                obj.push(val);
        }
        }
        while(obj.size()>0)
            sum = sum+obj.pop();
        
        return sum;
        
    }
}
       
        // int temp = ops.length();
        // int sum = 0;
        // int[] arr = new int[20];
        // for(int i = 0 ;i < ops.length;i++){
        //     if(ops[i].equals("+")){
        //         arr[i] = arr[i-2]+arr[i-1];
        //     }
        //     else if(ops[i]=="D"){
        //         arr[i] = arr[i-2]*arr[i-1];
        //     }
        //     else if(ops[i]=="C"){
        //         arr[i-1]=0;// = arr[i-2]*arr[i-1];
        //     }
        //     else{
        //         arr[i]= Integer.parseInt(ops[i]);
        //     }
        // }
        // int len = arr.length();
        // for(int j=0;j<len;j++){
        //     sum = sum+arr[i];
        // }
        // return sum;
     
  
