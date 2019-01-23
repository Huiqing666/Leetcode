class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> res = new ArrayList<>();
        int min = list1.length + list2.length;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (map.get(list2[i]) + i == min) {
                    res.add(list2[i]);
                }
                else if (map.get(list2[i]) + i < min) {
                    res.clear();
                    res.add(list2[i]);
                    min = map.get(list2[i]) + i;
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
