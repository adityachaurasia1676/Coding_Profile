class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>() ;
        sum(0, candidates, target, new ArrayList<>(), res ) ;
        return res ;
    }
    public void sum(int idx, int[] candidates, int target, List<Integer> current, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(current)) ;
            return ;
        }
        if(idx == candidates.length || target < 0){
            return ;
        }
        if(candidates[idx] <= target){
            current.add(candidates[idx]) ;
            sum(idx, candidates, target - candidates[idx], current,res) ;
            current.remove(current.size() - 1) ;
        }
        sum(idx + 1, candidates, target, current, res) ;
    }
}