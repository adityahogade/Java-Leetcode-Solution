class Solution {

    public void combSum(int[] cand, int target, int start,
                        List<Integer> comb,
                        List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i < cand.length; i++) {

            
            if (i > start && cand[i] == cand[i - 1]) {
                continue;
            }

           
            if (cand[i] > target) {
                break;
            }

            comb.add(cand[i]);

            
            combSum(cand, target - cand[i], i + 1, comb, ans);

            // Backtrack
            comb.remove(comb.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        combSum(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }
}