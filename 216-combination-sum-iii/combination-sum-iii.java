class Solution {
    public void solve(int start, int k, int n, List<Integer> ds, List<List<Integer>> ans){
        if(ds.size() == k){
            if(n == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        for(int i = start; i <= 9; i++){
            ds.add(i);
            solve(i+1, k, n-i, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList();
         solve(1, k, n, new ArrayList<>(), ans);
        return ans;
    }
}