class Solution {
    public boolean judgeCircle(String moves) {
        int c1=0,c2=0;
        for(char ch : moves.toCharArray()){
            switch(ch){
                case 'U': c1++; break;
                case 'D': c1--; break;
                case 'L': c2--; break;
                case 'R': c2++; break;
            }
        }
        return (c1==0) && (c2==0);
    }
}