/**
 * @param {number[]} nums
 * @return {number}
 dheko is question me yeah poocha gya hai ki ek professional choor hai jisko chori kerni hai but conditions yeah hai ki jis gher me chori kerega uske bagal vale gher me chori nhi kerni use nhi to alarm baj jayega to jo choor hai ki order me chori kerega ki max amount chura sake
 
 is question me humare paas ek nums naam ka ek array hai jisme kuch values hai vo values yeah bta rha ki kis gher me kitna paisa hai to choor kis order me churai ki use jyda amount mil sake
 
 mins ki example 2 me dheko agr choor index 0,2,4 vale gher me chori kerta hai to use 2+9+1= 12 ruees milte hai but agr choor index no. 1,3 me choori kerta hai to use 7+3= 10 rupees he milte hai
 
 
 */
var rob = function(nums) {

//nums ek array hai jo compiler ke through as a argument bheja gya hai

// 
 //nums.lenghth mins ki agr array ki length 0 hai or say that agr array me koi value nhi hai seedhe 0 return ker dega
    if (nums.length===0) return 0;
    
    //usetarah agr lenghth 1 hai to 0 index pe jo value hai use return ker dega
  if (nums.length === 1) return nums[0];
    
 // but agr length 2 hai array ki size to is case me return Math.max... jo likha hai n vo batata hai ki us function ke ander jo values likhi hui hai unme se subse badi value kon se hai mins ki nums[0] bada hai ki num[1]
  if (nums.length === 2) return Math.max(nums[0], nums[1]);
  
    
 //p1 me humne pahele index ki value dal di or   
  let p1 = nums[0];
    
 // p2 me humne pahele index or doosre index me se jo bada hoga uski value dal di
  let p2 = Math.max(nums[0], nums[1]);
    
    
//fir humne for loop chalaya 2 se bcoz humne index 0 or 1 ki starting me he check ker liyaa tha or yeah loop chelega nums array ki size/length tak
  for (let i = 2; i < nums.length; i ++) {
      
  //nums[i] mins ki third Index of array + p1 mins ki zeroth index of nums, p1+nums[], first index + third index liyea bcoz upper dheko humne p1 me index zero ki value dali thi
 // to p2 and p1+nums me jo bada hoga vo temp me chele jayega
    const temp = Math.max(p2, p1 + nums[i]);
    p1 = p2;
    p2 = temp;
  }
    // phir vohi swap kera ke poora sum kera lenge phir last me p2 ki value return ker denge
  
  return p2;
    }
