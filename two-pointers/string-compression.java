class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1 )return 1;
        int count = 1;
        int i = 0;
        int j = 1;
        int c = 0;
        while(i<chars.length && j<chars.length){
            if(chars[i]==chars[j]){
                count++;
            }
            else{
                chars[c++] = chars[i];
                if(count>1){
                    char cnt[] = String.valueOf(count).toCharArray();
                    for(char di : cnt){
                        chars[c++] = di;
                    }
                }
                count = 1;
                i = j;
            }
            j++;
        }
        chars[c++] = chars[i];
        if(count>1){
        char cnt[] = String.valueOf(count).toCharArray();
            for(char di : cnt){
                chars[c++] = di;
            }
        }
        return c;
    }
}