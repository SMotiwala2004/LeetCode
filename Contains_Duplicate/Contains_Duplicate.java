class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Hash set doesn't allow duplications
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            //Adds all numbers from nums to set except for duplicated numbers
            set.add(nums[i]);
        }

        if(set.size() < nums.length) {
            //Return true if the size of set is less due to removed duplicates
            return true;
        }
        return false;
    }
}