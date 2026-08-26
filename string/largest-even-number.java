class Solution {
    public String largestEven(String s) {

        if(!s.contains("2")){
            return "";
        }
        else{
            int index = s.lastIndexOf("2");
            return s.substring(0,index+1);
        }
        
    }
}