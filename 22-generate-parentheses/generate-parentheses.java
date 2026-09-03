class Solution {

    public void generate(int open, int close, int n,
                         String s, List<String> ans) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }
        if (open < n) {
            generate(open + 1, close, n, s + "(", ans);
        }
        if (close < open) {
            generate(open, close + 1, n, s + ")", ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(0, 0, n, "", ans);
        return ans;
    }
}