class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    list.add(i);
                    list.add(j);

                }
            }
        }








       int[] result = new int[list.size()];
        for (int k = 0; k< list.size(); k++) {
            result[k] = list.get(k);
        }
        
        return result;
    }
}