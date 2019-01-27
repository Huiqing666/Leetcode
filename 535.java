public class Codec {
    HashMap<Integer, String> url = new HashMap<>();
    Random r = new Random();
    int index = r.nextInt(10000);
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        while (url.containsKey(index)) {
            index = r.nextInt(10000);
        }
        
        url.put(index, longUrl);
        return String.valueOf(index);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        // System.out.println(shortUrl);
        // int short = 1;
        
        if (!url.containsKey(Integer.parseInt(shortUrl))) return "";
        return url.get(Integer.parseInt(shortUrl));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
