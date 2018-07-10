class Solution {
    public int maxDistToClosest(int[] seats) {
        if(seats.length == 1) return 0;
        int prezeros = 0;
        int postzeros = 0;
        int i = 0;
        for(; i < seats.length; i++){
            if(seats[i] == 0){
                prezeros++;
            }else{
                break;
            }
        }
        int max = 0;
        int temp = 0;
        for(; i < seats.length; i++){
            if(seats[i] == 0) {
                temp++;
            }else{
                max = Math.max(temp, max);
                temp = 0;
            }
        }
        for(int j = seats.length - 1; j >= 0; j--){
            if(seats[j] == 0){
                postzeros++;
            }else{
                break;
            }            
        }
        return Math.max(Math.max(prezeros, postzeros), (max+1)/2);
    }
}
