public class Codec {

    private HashMap<String,String> urls = new HashMap<>();
    private String tinyUrl = "http://tinyurl.com/";
    int leftLimit = 48; // numeral '0'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 6;
    Random random = new Random();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String generatedString = random.ints(leftLimit, rightLimit + 1)
          .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
          .limit(targetStringLength)
          .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
          .toString();
        String shortUrl = tinyUrl+generatedString;
        urls.put(longUrl,shortUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String result = "";
        for(String key : urls.keySet()){
            if(urls.get(key) == shortUrl){
                result = key;
            }
        }
        return result;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));