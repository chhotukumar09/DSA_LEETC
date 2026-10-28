class Solution {
    public void  findsubsets(int idn, int[] arr, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i = idn; i < arr.length; i++){
            if(i != idn && arr[i] == arr[i -1]) continue;
            ds.add(arr[i]);
            
            findsubsets(i+1, arr, ds, ans);
            ds.remove(ds.size() - 1);


        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findsubsets(0, nums, new ArrayList<>(), ans);
        return ans;
        
    }
}