class Solution {
    static String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    List<String> ans=new ArrayList<>();

    public void letterComb(String dig,int ind ,String comb){
        if(ind==dig.length()){
            ans.add(comb);
            return;
        }
        char c=dig.charAt(ind);
        String letter=keypad[c-'0'];
        for(int i=0;i<letter.length();i++){
            char ch=letter.charAt(i);
            letterComb(dig,ind+1,comb+ch);
        }

    }

    public List<String> letterCombinations(String digits) {
        letterComb(digits,0,"");
        return ans;
    }
}