class Solution {
    public int numOfPairs(String[] nums, String target) {
        HashMap<String,Integer> hm=new HashMap<>();
        int count =0;
        
        for(String str: nums){
            if(target.startsWith(str)){
                String suf = target.substring(str.length());
                if(hm.containsKey(suf)) count+=hm.getOrDefault(suf,0);
            }
            if(target.endsWith(str)){
                String pref=target.substring(0,target.length()-str.length());
                if(hm.containsKey(pref)) count+=hm.getOrDefault(pref,0);
            }
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
return  count;
        
    }
}