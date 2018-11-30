class Solution {
    class Log {
        String id;
        String s;
        boolean isNum;
        Log(String log) {
            // String[] ss = str.split("@", 2)
            id = log.split("\\s+", 2)[0];
            s = log.split("\\s+", 2)[1];
            if (s.charAt(0) - '0' >= 0 && s.charAt(0) - '0' <= 9) {
                // System.out.println(s.charAt(0));
                isNum = true;
            }
            else {
                isNum = false;
            }
        }
    }
    public String[] reorderLogFiles(String[] logs) {
        List<Log> list = new ArrayList<>();
        int j = logs.length - 1;
        for (int i = logs.length - 1; i >= 0; i--) {
            Log l = new Log(logs[i]);
            if(l.isNum == false) list.add(l);
            else {
                String temp = logs[i];
                logs[i] = logs[j];
                logs[j] = temp;
                j--;
            }
        }
        Collections.sort(list, new Comparator<Log>() {
            @Override
            public int compare(Log a, Log b) {
                if (a.isNum && b.isNum) {
                    return 1;
                }
                if (a.isNum) {
                    return -1;
                }
                if (b.isNum) {
                    return 1;
                }
                return a.s.compareTo(b.s);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            Log l = list.get(i);
            // System.out.println(l.id + " " + l.s);
            logs[i] = l.id + " " + l.s;
        }
            
        return logs;
    }
}
