class Solution {
    public boolean isPalindrome(int x) {
        int total = 0;
        int k = x;
        while(x > 0){
            
            int b = x%10;
            total = total*10 + b;
            x = x/10;
        
        }
        if(total == k)
        return true;
        return false;
    }
    }
