class 2515_Shortest_Distance_to_Target_String_in_Circular_Array {
    public int closestTarget(String[] words, String target, int startIndex) {
        
        int n=words.length;

        for(int k=0;k<=n/2;k++){
            int left=(startIndex-k+n)%n;
            int right=(startIndex + k)%n;

            if(target.equals(words[left])) return k;
            if(target.equals(words[right])) return k;

        }
        return -1;
    }
}