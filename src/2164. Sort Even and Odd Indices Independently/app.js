/**
 * @param {number[]} nums
 * @return {number[]}
 */
 var sortEvenOdd = function(nums=[]) {
    const Odd=nums.filter((x,i)=>i%2!==0);
    const Even=nums.filter((x,i)=>i%2===0);
    Odd.sort((a,b)=>b-a);
    Even.sort((a,b)=>a-b);
    let j=0,k=0;
    for(let i=0;i<nums.length;i++){
        if(i%2===0){
            nums[i]=Even[k++];
        }else{
            nums[i]=Odd[j++];
        }
    }
    return nums;
};