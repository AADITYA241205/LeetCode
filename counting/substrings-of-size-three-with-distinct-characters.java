class Solution {
    public int countGoodSubstrings(String s) {

    if(s.length()<3)return 0;

    Map<Character,Integer> map = new HashMap();
    for(int i = 0 ; i<3 ; i++){
        map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
    }
    int c = 0;
    if(map.size()==3)c++;

    int low = 0;
    for(int i = 3 ; i<s.length() ; i++){

        map.put(s.charAt(low) , map.getOrDefault(s.charAt(low),0)-1);
        if(map.get(s.charAt(low))==0){
            map.remove(s.charAt(low));
        }
        low++;

        map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);

        if(map.size()==3)c++;

    }
        return c;
    }
}