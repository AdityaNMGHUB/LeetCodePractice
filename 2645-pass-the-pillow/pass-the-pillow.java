class Solution {
    public int passThePillow(int n, int time) {
        int person = 1;
        int direction = 1;
        while(time>0){
            person+=direction;
            if(person==n){
                direction=-1;
            }else if(person==1){
                direction=1;
            }
            time--;
        }
        return person;
    }
}