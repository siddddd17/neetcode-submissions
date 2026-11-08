class Solution {
    // 1#I4#Hate3#You
    public String encode(List<String> strs) {
        StringBuilder strBuilder = new StringBuilder(); 
        for(String str : strs)
            strBuilder
            .append(str.length())
            .append('#')
            .append(str); 
        return strBuilder.toString(); 
    }

    public List<String> decode(String str) {
        int i = 0 ; 
        List<String> res = new ArrayList<>() ; 
        while ( i < str.length()){
            int j = i; 
            while(str.charAt(j) != '#'){
                j++; 
            }
            int len = Integer.parseInt(str.substring(i, j)); 
            i = j+1; 
            j = i + len; 
            res.add(str.substring(i, j)); 
            i = j; 
        }
        return res; 
    }
}
