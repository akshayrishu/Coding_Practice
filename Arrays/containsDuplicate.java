import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>st = new HashSet<>();
        for(int num:nums){
            if(st.contains(num)){
                return true;
            }
            st.add(num);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 1};

        Solution obj = new Solution();

        boolean result = obj.containsDuplicate(arr);

        System.out.println("Contains Duplicate: " + result);
    }
}
