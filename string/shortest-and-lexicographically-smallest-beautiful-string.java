class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int low = 0;
        int a = 0;
        int min = Integer.MAX_VALUE;
        StringBuilder str = new StringBuilder();
        for(int high = 0 ; high<s.length() ; high++){

            if(s.charAt(high)=='1')a++;

            while(a>k){
                if(s.charAt(low)=='1')a--;

                low++;
            }

            if(a==k){
                while(s.charAt(low)=='0')low++;
                if(min>(high-low+1)){
                    min = high-low+1;
                    str = new StringBuilder(s.substring(low,high+1));
                }
                else if(min==(high-low+1)){
                    int i = low;
                    int j = 0;
                    while(i<=high && j<str.length()){
                        if(str.charAt(j)>s.charAt(i)){
                            str = new StringBuilder(s.substring(low,high+1));
                            break;
                        }
                        else if (s.charAt(i) > str.charAt(j)) {
                            break;
                        }
                        i++;
                        j++;
                    }
                }
                
            }

        }
        return str.toString();
    }
}