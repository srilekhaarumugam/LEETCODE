class Solution {
    public boolean isPalindrome(String s) {
        String r="";
     for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
             r=r+Character.toLowerCase(ch);
        } 
     }
     String a="";
     for(int i=r.length()-1;i>=0;i--){
        a+=r.charAt(i);
     } 
     return r.equals(a);  
    }
}