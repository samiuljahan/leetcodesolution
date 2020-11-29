class Solution {
    public boolean isPalindrome(int x) {
        if(x == reverse(x)) return true;
        return false;
    }
    int reverse(int x){ 
        int num = 0;
        while(true){
            int r = x % 10
            if(num == 0) num = r;
            else num = (num * 10) + r;
            x /= 10;
            if(x == 0) break;
        }
        return num;
    }
}