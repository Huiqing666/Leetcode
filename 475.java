class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        if(houses.length < 2) return 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int[] dist = new int[houses.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int j = 0;
        for (int i = 0; i < houses.length; i++){
            if(houses[i] <= heaters[j]){
                dist[i] = heaters[j] - houses[i];
            }else{
                if(j < heaters.length - 1){
                    j++;
                    i--;
                }
            }
        }
        j = heaters.length - 1;
        int max = 0;
        for (int i = houses.length -1; i >= 0; i--) {
            if(houses[i] >= heaters[j]){
                dist[i] = Math.min(dist[i], houses[i] - heaters[j]);
            }else{
                if(j > 0){
                    i++;
                    j--;
                }
            }
            
        }
        for(int i : dist){
            max = Math.max(max, i);
        }
        return max;
            
            
    }
}
