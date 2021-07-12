/*dheko question me yeah poocha gya tha ki humare paas ek array hai or us array me jitne bhi numbers hai vo starting me aa jai or uske baad jitne bhi zeros hai vo aa jai
 */

var moveZeroes = function(nums) {
    
    let index = 0;
    for (let i = 0; i < nums.length; i ++) {
        if (nums[i] !== 0) {
            nums[index++] = nums[i]
        }
    }
    for (let i = index; i < nums.length; i++) {
        nums[i] = 0
    }
};

/*solutions
to pahele humne ek index naam ka variable declear kiyaa bcoz yeah java script hai ise liyea humne let ka use kiyaa hai in line no. 10 me

phir humne ek for loop chalaya jaise subme kerte hai i=0 se; I  smaller than num.length
jo num.length hai iska matlab yeah hai ki num ek array hai jo compiler ke through line no. 8 me as a argument aaya hai or length ek keyword hai jo num.length sath me lagai to to num array ki length batayega

in line no. 12 me num[i] isme arraay ek ek value se aage badhega index by index or sath me check karega not equals to zero to nhi n 

mins ki line no. 12 if conditions me yeah check ker rha ki agr zero nhi hai to line no. 13 ki help se array me store kera dega us value ko

to ek tarah se dheka jai to zero hta ke uski jaghe no. ko shift ker diya hai or by the help of index++ yeah check kiyea hai ki kitna no. shift hua hai

mins ki agr hum first example dheke to 3 different no shift ho jayenge but array ki length 5 hai to baki 2 block bach rhe hau to hum last vali for loop ki help se bache hue 0 insert kera denge  

*/
