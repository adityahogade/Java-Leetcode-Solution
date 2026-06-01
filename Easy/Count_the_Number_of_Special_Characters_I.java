class Solution {
    public int numberOfSpecialChars(String word) {
        
        HashMap<Integer,Integer> hmLower=new HashMap<>();
        HashMap<Integer,Integer> hmUpper=new HashMap<>();
       

        for(int i=0;i<word.length();i++){
            int ch=(int)word.charAt(i);
            if(ch>90)  hmLower.put(ch-97,hmLower.getOrDefault(ch-97,0)+1);
            
            else    hmUpper.put(ch-65,hmUpper.getOrDefault(ch-65,0)+1);
        }
        int c=0;
        for(int i:hmLower.keySet()){
            if(hmUpper.containsKey(i)){
                c++;
            }
        }
return c;
    }
}