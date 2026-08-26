class Solution {
    public String[] findWords(String[] words) {

        char arr1[] = {'q','w','e','r','t','y','u','i','o','p'};
        char arr2[] = {'a','s','d','f','g','h','j','k','l'};
        char arr3[] = {'z','x','c','v','b','n','m'};

        List<String> str = new ArrayList<>();

        int c = 0;
        for(int i = 0 ; i<words.length ; i++){
            String s = words[i].toLowerCase();
            int frow = 0;
            int srow = 0;
            int trow = 0;
            for(int j = 0 ; j<words[i].length() ; j++){
                for(int k = 0 ; k<arr1.length ; k++){
                    if(s.charAt(j)==arr1[k]){
                        frow++;
                    }
                }
                for(int k = 0 ; k<arr2.length ; k++){
                    if(s.charAt(j)==arr2[k]){
                        srow++;
                    }
                }
                for(int k = 0 ; k<arr3.length ; k++){
                    if(s.charAt(j)==arr3[k]){
                        trow++;
                    }
                }
            }

            if(words[i].length()==frow || words[i].length()==srow || words[i].length()==trow){
                str.add(words[i]);
            }

        }

        return str.toArray(String[]::new);
    }
}