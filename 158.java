/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    int start = 0;
    int end = 0;
    char[] newbuf;
    public int read(char[] buf, int n) {
        
        int count = 0;
        if (n == 0) return 0;
        if  (start != 0) {
            System.out.println(start + " " + end);
            for(int i = start; i < end; i++) {
                buf[count++] = newbuf[i];
                if(count == n) {
                    start = i+1;
                    return count;
                }
            }
        }
        while (count < n) {
            newbuf = new char[4];
            int temp = read4(newbuf);
            //count += temp;
            int tempcount = count;
            end = temp;
            for(int i = 0; i < Math.min(temp, n - tempcount); i++) {
                buf[count++] = newbuf[i];
                start = i+1;
            }
            if(start > 4) start = 0;
            //System.out.println(Math.min(temp, n - count));
            if(temp < 4) {
                //System.out.println(temp);
                return count;
            }
            
        }
        return count;
        
    }
}
