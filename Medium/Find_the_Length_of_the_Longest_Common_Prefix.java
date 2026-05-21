class Solution {
    void addPrefix(HashMap<Integer,Integer> hm,int ele){
        int digit =  (ele==0) ? 1 : (int) Math.log10(Math.abs(ele))+1;
        int power=digit-1;
        while(power>=0){
            int ele2=(int)Math.floor(ele/Math.pow(10,power));
            hm.put(ele2,hm.getOrDefault(ele2,0)+1);
            power--;
        }
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr2.length;i++){
        addPrefix(hm,arr2[i]);
        }
        int max=0;
        for(int i=0;i<arr1.length;i++){
            int no=arr1[i];
            while(no!=0){
            if(hm.containsKey(no)){
                int digit=(no==0) ? 1 : (int) Math.log10(Math.abs(no))+1;
                max=Math.max(digit,max);
                break;
            }
            else no=no/10;
            }
        }
        return max;
    }
}