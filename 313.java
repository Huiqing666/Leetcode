class Solution {
    public int countPrimes(int n) {
        if(n <= 1) return 0;
        int count = 0;
        boolean[] check = new boolean[n];
        for(int i = 2; i < n; i++){
            if(!check[i])count++;
            else continue;
            for(int j = 2; i*j < n; j++){
                check[i*j] = true;
            }
        }
        return count;
        /*
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i <= n; i++){
            a.add(i);
        }
        int m = 0;
        int times = 2;
        for(int i = 2; a.get(i) < n; i++){
            int current = a.get(i);
            m++;
            times = 2;
            //System.out.println(current);
            while(current * times < n){
                a.remove(new Integer(current * times));
                times++;
                //else times++;
            }
        }
        return m;
        */
    }
}
