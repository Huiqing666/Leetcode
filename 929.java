class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<String>();
        for (int i = 0; i < emails.length; i++) {
            String temp = preprocessing(emails[i]);
            uniqueEmails.add(temp);
        }
        return uniqueEmails.size();
    }
    private String preprocessing(String s) {
        String[] two = s.split("@");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < two[0].length(); i++) {
            if (two[0].charAt(i) == '+') {
                break;
            }
            else if (two[0].charAt(i) != '.') {
                sb.append(two[0].charAt(i));
            }
        }
        sb.append("@");
        sb.append(two[1]);
        return sb.toString();
    }
}
