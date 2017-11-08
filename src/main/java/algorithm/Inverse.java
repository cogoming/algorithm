package algorithm;

/**
 * 算法-逆推 
 * 算法题目
 * 1.小龙每个月的生活费是1000块，一共读4年
 * 2.现银行有一个整存零取的存款方式，年利率是0.0172
 * 3.小龙的爸爸需要在一次性存多少钱
 * @author astart
 * @create 2017年11月8日 下午4:58:46 
 *
 */
public class Inverse {

	public Inverse() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		/*
		 * 1.
		 * for(48){
		 * 	上一个月银行的钱 = 这个月取的钱\(1+0.172/12);
		 *  这个月的钱=上一个月银行的钱; 
		 * }
		 */
		//年利率 
		Double[] monthMoneyArr = new Double [49];
		monthMoneyArr[48] = 1000d;
		Double monthRate = 0D;
		Double previousMonthMoney = 0D;
		Double currMonthMoney = 1000D;
		monthRate = 0.0171/12;
		for(int i=47;i>0;i--){
			previousMonthMoney = (1000+currMonthMoney)/(1+monthRate);
			currMonthMoney = previousMonthMoney;
			System.out.println("第"+i+"个月银行存款为="+currMonthMoney);
			
		}
	}
}
