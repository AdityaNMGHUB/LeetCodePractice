class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answer = new String[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(score[i], i);
        }
        Arrays.sort(score);
        for(int i = n-1; i>=0; i--){
            int index = map.get(score[i]);
            int rank = n-i;
            if(rank == 1){
                answer[index] = "Gold Medal";
            }else if(rank == 2){
                answer[index] = "Silver Medal";
            }else if(rank == 3){
                answer[index] = "Bronze Medal";
            }else{
                answer[index] = String.valueOf(rank);
            }
        }
        return answer;
    }
}