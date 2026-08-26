class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length -1;

        while(i<j){
            char chi = arr[i];
            char chj = arr[j];

            if(!(chi=='a' || chi=='e' || chi=='i' || chi=='o' || chi=='u' || chi=='A' || chi=='E' || chi=='I' || chi=='O' || chi=='U')){
                i++;
            }            
            else if(!(chj=='a' || chj=='e' || chj=='i' || chj=='o' || chj=='u' || chj=='A' || chj=='E' || chj=='I' || chj=='O' || chj=='U')){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }            

        }

        return new String(arr);
        
    }
}