class Solution {
    public int totalMoney(int n) {
        int total=0;
       int money=1;
       for(int i=0;i<n;i++){
        total+=money+(i%7);
        if(i%7==6){
            money++;
        }
       }
       return total;
    }
}