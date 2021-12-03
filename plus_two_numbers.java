# You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

# Increment the large integer by one and return the resulting array of digits.


class Solution {
    public int[] plusOne(int[] digits) {
        
     int lastIndex = digits.length-1;
        
        while(lastIndex >=0 ){
            
            if(digits[lastIndex] != 9){
                digits[lastIndex] = digits[lastIndex]+1;
                break;
            }else
                if(lastIndex == 0){
                    int[] resultArr = new int[digits.length + 1];
                    resultArr[0] = 1;
                    return resultArr;
                }
            
                    digits[lastIndex] = 0;
                    lastIndex--;
        }
       return digits;
    }
}
