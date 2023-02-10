bool isPalindrome(int x){
    if(x>0){
        int x0=x;
        int rem=0;
        long rev=0;
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(x0==rev){
            return 1;
        }
        else{
            return 0;
        }
    }
    else if (x==0){
        return 1;
    }
    else{
        return 0;
    }
}
