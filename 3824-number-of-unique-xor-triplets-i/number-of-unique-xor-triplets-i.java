class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int count=0;
        while(n!=0){
            n/=2;
            count++;
        }
        return (int)Math.pow(2,count);
    }
}