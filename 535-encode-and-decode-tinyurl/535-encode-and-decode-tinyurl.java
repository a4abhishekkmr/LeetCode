public class Codec {
    
    //encode produces short URLs like http://tinyurl.com/0, http://tinyurl.com/1, etc, in that order.
    //al is database
    ArrayList<String> al=new ArrayList<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        al.add(longUrl);
        String value=Integer.toString(al.size()-1);
        return "http://tinyurl.com/" + value;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String value[]=shortUrl.split("/");
        int val=Integer.valueOf(value[value.length-1]);
        return al.get(val);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));