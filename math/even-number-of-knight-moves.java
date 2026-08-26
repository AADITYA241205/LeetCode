class Solution {
    public boolean canReach(int[] start, int[] target) {

        int x = start[0];
        int y = start[1];
        int a = -1;
        if (x % 2 == 0 && y % 2 == 0) {
            a = 0;
        } else if (x % 2 != 0 && y % 2 != 0) {
            a = 0;
        } else {
            a = 1;
        }

        if (a == 0) {
            if (target[0] % 2 == 0 && target[1] % 2 == 0) {
                return true;
            } else if (target[0] % 2 != 0 && target[1] % 2 != 0) {
                return true;
            }
        }
        else if(a==1){
             if (target[0] % 2 != 0 && target[1] % 2 == 0) {
                return true;
            } else if (target[0] % 2 == 0 && target[1] % 2 != 0) {
                return true;
            }
        }

        return false;
        // if(x==y && target[0]==target[1]){
        //     return true;
        // }
        // else if(x!=y && target[0]!=target[1]){
        //     return true;
        // }
        // return false;
    }
}