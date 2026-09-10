class Solution {
    void solve(int index,String cs,List<String>ans,String digits,String[]map){
        if(index==digits.length()){
            ans.add(cs);
            return;
        }
        String letters=map[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
             cs+=letters.charAt(i);
              solve(index+1,cs,ans,digits,map);
              cs=cs.substring(0,cs.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[]map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>ans=new ArrayList<>();
        String cs="";
        int size=0;
        solve(size,cs,ans,digits,map);
        return ans;
    }
}