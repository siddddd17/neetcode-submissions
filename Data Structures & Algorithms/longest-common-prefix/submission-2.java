class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        Arrays.sort(strs); 
        String shortest = strs[0]; 
        if(shortest.length() == 0 ){
            return prefix;
        }
        if(strs.length  == 1){
            return strs[0];
        }
        if(shortest.charAt(0)!= strs[1].charAt(0)){
            return prefix; 
        }
        for (int i = 0 ; i < shortest.length() ; i ++ ){ 
            for ( int j = 1; j < strs.length ; j++){
                if(shortest.charAt(i) !=strs[j].charAt(i)){
                    return prefix;
                } 
            }
            prefix += shortest.charAt(i);
        }
        return prefix;
    }
}