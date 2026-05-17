class Solution {

    public String encode(List<String> strs) {
        var strbuf = new StringBuffer();
        for(String str: strs){
            strbuf.append(str);
            strbuf.append("~~");
        }
        return strbuf.toString();
    }

    public List<String> decode(String str) {
        var result = Arrays.asList(str.split("~~"));
        return result.size() ==0 ? Arrays.asList("") : result ;
    }
}
