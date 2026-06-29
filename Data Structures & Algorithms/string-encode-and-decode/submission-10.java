class Solution {
    // 1#I4#Hate3#You
    public String encode(List<String> strs) {
        StringBuilder stringBldr = new StringBuilder() ; 
        for(String str: strs){
            stringBldr.append(str.length()).append("#").append(str);
        }
        return stringBldr.toString(); 
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>(); 

        int i = 0; 
        while ( i < str.length()){
            int j = i; 
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1; 
            j = i + length; 
            res.add(str.substring(i, j)); 
            i = j; 
        }
        return res;
    }
}
