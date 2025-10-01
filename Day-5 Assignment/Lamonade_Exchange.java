class Lamonade_Exchange {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        for(int bill:bills){
            if(bill==5){
                f++;
            }
            else if(bill==10){
                t++;
                f--;
            }
            else if(t>0){
                t--;
                f--;
            }else{
                f-=3;
            }
        if(f<0){
                return false;
            }
        }
        return true;
    }
}