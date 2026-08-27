class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int[] sarr = new int[26];
        int[] tarr = new int[26];

        for(int i = 0 ; i<s.length() ; i++){
            sarr[s.charAt(i)-'a']++;
        }
        for(int i = 0 ; i<target.length() ; i++){
            tarr[target.charAt(i)-'a']++;
        }

        StringBuilder str = new StringBuilder();

        // for(int i = 0 ; i<26 ; i++){
            
        //     while(tarr[i]!=0){

        //         for(int j = i ; j<26 ; j++){
        //             if(sarr[j]!=0){
        //                 str.append((char)(j+'a'));
        //                 sarr[j]--;
        //                 break;
        //             }
        //         }
        //         tarr[i]--;

        //     }

        // }

        boolean flag = false;

        for(int i = 0 ; i<target.length() ; i++){

            int a = target.charAt(i)-'a';

            for(int j = a ; j<26 ; j++){
                
                if(sarr[j]!=0 && a==j){
                    str.append((char)(j+'a'));
                    sarr[j]--;
                    break;
                }

                if(sarr[j]!=0){
                    str.append((char)(j+'a'));
                    sarr[j]--;
                    flag = true;
                    break;
                }
            }
            if(flag)break;

        }

        for(int i = 0 ; i<26 ; i++){
            if(sarr[i]!=0){
                    str.append((char)(i+'a'));
                    sarr[i]--;
                }
        }
        
        if(str.toString().equals(target))return "";

        return str.toString();
    }
}