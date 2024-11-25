class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int i=0,j=0;
        int n=players.length;
        int m=trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(i<n && j<m){
            if(players[i]<=trainers[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}