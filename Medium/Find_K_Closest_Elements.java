class Solution {
    boolean check(int[] arr,int x,int mid,int k){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(Math.abs(x-arr[i])<=mid) c++;
        }
        return c>=k;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int l=0,r=Integer.MAX_VALUE;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(check(arr,x,mid,k)){
                ans=mid;
                r=mid-1;
            }
            else l=mid+1;
             
        }

        List<Integer> li=new ArrayList<>();
        int c=0;
        for(int i=0;i<n;i++){
            if(Math.abs(x-arr[i])<=ans){
                if(c<k){
                li.add(arr[i]);
                c++;
                }
                else {
                    if(Math.abs(li.get(0)-x)>Math.abs(arr[i]-x)){
                        li.remove(0);
                        li.add(arr[i]);
                    }
                } 
            }
        }
        return li;
    }
}