class Solution {
    public String sortVowels(String s) {

        int[] arr = new int[128];

        for(int i =  0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c =='O' || c=='U'){
                arr[c]++;
            }
        }

        StringBuilder ans = new StringBuilder(s);
 
        int j = 0;
        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c =='O' || c=='U'){

                while(arr[j] == 0){
                    j++;
                }

                ans.setCharAt(i,(char)j);
                arr[j]--;
            }
        }

        return ans.toString();
    }
}