class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n=pattern.length();
        int m=s.length();
        HashMap<String,Character> hm1=new HashMap<>();
                HashMap<Character,String> hm2=new HashMap<>();

        int j=0;
        for(int i=0;i<n;i++){
            String curr="";
            if(j>=m) return false;

                while(j<m && s.charAt(j)!=' ' ){
                    curr+=s.charAt(j);
                    j++;
                }
                j++;
            if(hm1.containsKey(curr)){
                char ch=hm1.get(curr);
                
                if(ch!=pattern.charAt(i)) return false;
            }
            else {
                if(hm2.containsKey(pattern.charAt(i))) return false;
                hm2.put(pattern.charAt(i),curr);
                hm1.put(curr,pattern.charAt(i));
                }

        }
        return j>=m;
    }
}