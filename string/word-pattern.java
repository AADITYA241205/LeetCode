class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character , String> pat = new HashMap<>();
        HashMap<String , Character> smap = new HashMap<>();

        String[] arr = s.split(" ");

        if(pattern.length()!=arr.length){
            return false;
        }

        for(int i = 0 ; i<arr.length ; i++){
            
            if(pat.containsKey(pattern.charAt(i))){
               if(!(pat.get(pattern.charAt(i)).equals(arr[i]))){
                return false;
               }
            }
            else{
                pat.put(pattern.charAt(i),arr[i]);
            }

            
            if(smap.containsKey(arr[i])){
               if(!(smap.get(arr[i]).equals(pattern.charAt(i)))){
                return false;
               }
            }
            else{
                smap.put(arr[i],pattern.charAt(i));
            }

        }
        return true;
    }
}