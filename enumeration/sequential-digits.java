class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
    
        ArrayList<Integer> ans = new ArrayList<>();
        String s = "123456789";
        String l = String.valueOf(low);
        String h = String.valueOf(high);
        for(int len = l.length() ; len<= h.length() ; len++){
            for(int start = 0 ; start <= 9 - len ; start++){
                int digit = Integer.parseInt(s.substring(start, start+len));
                if(digit>=low && digit<=high){
                    ans.add(digit);
                }
            }
        }
        
        return ans;

        // while(n<=high){
        //     StringBuilder str = new StringBuilder(n+"");
        //     boolean flag = true;
        //     int c = 0;
        //     for(int i = 1 ; i<str.length() ; i++){
        //         if((str.charAt(i)-'0') - (str.charAt(i-1)-'0')==1){
        //             continue;
        //         }
        //         else{
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag==true){
        //         int number = Integer.parseInt(str.toString()); 
        //         ans.add(number);
        //         c++;
        //     }
        //     n++;
        // }

        // return ans;

    }
}