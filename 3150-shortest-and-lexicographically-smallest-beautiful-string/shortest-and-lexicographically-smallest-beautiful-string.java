class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int l=0;
        int ones=0;
        int minlen=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
            while(ones>k){
                if(s.charAt(l)=='1'){
                    ones--;
                }
                l++;
            }
            if(ones==k){
                while(s.charAt(l)=='0'){
                     l++;
                }
                int len=i-l+1;
                String c=s.substring(l,i+1);
                if (len < minlen ||
                    (len == minlen && c.compareTo(ans) < 0)) {
                    minlen=len;
                    ans=c;
                }
            }
        }
        return ans;
    }
}