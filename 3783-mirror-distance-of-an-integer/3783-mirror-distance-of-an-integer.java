class Solution {
    public int mirrorDistance(int n) {
        int s = n;
        int d = 0;

        while(n!=0){
            int rem=n%10;
            d= d*10+rem;
            n=n/10;
        }
        return Math.abs(s-d); 
    }
}