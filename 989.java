class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        while (K > 0) {
            list.add(K % 10);
            K = K / 10;
        }
        int j = 0;
        int pre = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (j >= list.size()) {
                list.add((A[i] + pre) % 10);
                
                pre = (A[i] + pre) / 10;
                
            }
            else {
                int curr = list.get(j);
                list.set(j, (curr + pre + A[i]) % 10);
                pre = (curr + pre + A[i]) / 10;
            }
            //System.out.println(list.get(j));
            j++;
        }
        while (pre == 1) {
            if (j >= list.size()) {
                list.add(pre);
                pre = 0;
                
            }
            else {
                int curr = list.get(j);
                list.set(j, (curr + pre) % 10);
                pre = (curr + pre) / 10;
            }
            //System.out.println(list.get(j));
            
            j++;
        }
        
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        return list;
    }
}
