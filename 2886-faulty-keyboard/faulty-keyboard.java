class Solution {
    public String finalString(String s) {
       // StringBuilder s = new StringBuilder();
       if(!s.contains("i")){
        return s;
       }
       String ans="";
        for(int i = 0; i< s.length(); i++){
            char c =s.charAt(i);
            if(c=='i'){
                ans = reverse(ans);
            }
            else{
                ans=ans+c;
            }
        }
        return ans;
    }
    public String reverse(String s){
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            ans = s.charAt(i)+ans;
        }
        return ans;
    }
}