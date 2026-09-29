class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxDept=0;
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                depth++;
                if(depth>maxDept)maxDept=depth;
            }
            if(ch==')') depth--;

        }
        return maxDept;
    }
}