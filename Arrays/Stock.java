package Arrays;

public class Stock {
    public static void main(String[] args) {
        int prices [] ={7,1,5,3,6,6,4};
        System.out.println(BuyandSell(prices));

    }

    public static int BuyandSell(int prices[]){

        int buyingprince = Integer.MAX_VALUE; // + infinity
        int Maxprofit = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(buyingprince > prices[i]){
                //for future selling we willl buy stocks
                buyingprince = prices[i];
            }

            else {
                int Profit = prices[i] - buyingprince;
                Maxprofit = Math.max(Maxprofit,Profit);
            }
            }
            
        
        return Maxprofit;
        
    }
}
