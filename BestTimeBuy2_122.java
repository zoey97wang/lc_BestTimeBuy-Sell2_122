package leetcode;

public class BestTimeBuy2_122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a2 = {1,2,3,4,5,6};
		System.out.println(maxProfit(a2));
		
	}
	
	public static int maxProfit(int[] prices) {
		int total = 0;
		int min = prices[0];
		for(int i = 0; i< prices.length; i++ )
		{
			if(prices[i]>min){
				total = total + prices[i] - min;
				min = prices[i];
			}
		}
		return total;
    }

}
