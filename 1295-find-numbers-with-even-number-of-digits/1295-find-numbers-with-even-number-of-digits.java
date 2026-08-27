class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
        for(int b: nums){
            int s=0;
            while(b>0){
                s=s+1;
                b=b/10;
            }
            if(s%2==0){
                total=total+1;
            }
        }
        return total;        
    }
}