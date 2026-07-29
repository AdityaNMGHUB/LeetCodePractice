class Solution {
    public String smallestPalindrome(String s, int k) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        char mid=0;
        int[] half=new int[26];
        int halfLen=0;
        for(int i=0;i<26;i++){
            if((freq[i]&1)==1){
                mid = (char)('a'+i);
            }
            half[i] =freq[i]/2;
            halfLen +=half[i];
        }
        long total =count(half,k);
        if(total<k){
            return "";
        }
        StringBuilder left = new StringBuilder();
        for(int pos =0;pos<halfLen;pos++){
            for(int c =0;c<26;c++){
                if(half[c]==0)
                    continue;
                half[c]--;
                long ways =count(half,k);
                if(ways>=k){
                    left.append((char)('a'+c));
                    break;
                }
                k -=ways;
                half[c]++;
            }
        }
        String first =left.toString();
        String second =new StringBuilder(first).reverse().toString();
        if(mid==0)
            return first+second;
        return first+mid+second;
    }
    private long count(int[]cnt,long limit){
        int total=0;
        for(int x:cnt)
            total+=x;
        long ans =1;
        for(int i =0;i <26;i++){
            if(cnt[i]==0)
                continue;
            long choose = nCr(total,cnt[i],limit);
            if(ans>limit/choose)
                return limit;
            ans *=choose;
            if (ans>=limit)
                return limit;
            total-= cnt[i];
        }
        return ans;
    }
    private long nCr(int n,int r,long limit){
        if(r > n)
            return 0;
        r = Math.min(r,n-r);
        long res=1;
        for(int i =1;i<= r;i++){
            res = res*(n-r+i)/i;
            if(res>=limit)
                return limit;
        }
        return res;
    }
}