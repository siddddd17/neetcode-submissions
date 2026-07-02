class Solution {
    public boolean isPalindrome(String s) {
        int start = 0 ; 
        int end = s.length() -1; 
        while(start<end){
            while(start<end && !alphanum(s.charAt(start))) start++; 
            while(end > start && !alphanum(s.charAt(end))) end--; 
            if(Character.toLowerCase(s.charAt(start)) 
                != Character.toLowerCase(s.charAt(end))
            ) return false;
            start++; end--; 
        }
        return true; 
    }

    public boolean alphanum(char c){
        return (c>='A' && c<='Z') ||
               (c>='a' && c<='z') ||
               (c>='0' && c<='9') ; 
    }
}