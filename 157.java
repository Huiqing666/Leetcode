/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        if(n < 4) return Math.min(n, read4(buf));
        int count = 0;
        while (count < n) {
            char[] newbuf = new char[4];
            int temp = read4(newbuf);
            //count += temp;
            int tempcount = count;
            
            for(int i = 0; i < Math.min(temp, n - tempcount); i++) {
                buf[count++] = newbuf[i];
            }
            //System.out.println(Math.min(temp, n - count));
            if(temp < 4) {
                //System.out.println(temp);
                return count;
            }
            
        }
        return count;
    }
}
