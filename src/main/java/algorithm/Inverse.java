package algorithm;

/**
 * �㷨-���� 
 * �㷨��Ŀ
 * 1.С��ÿ���µ��������1000�飬һ����4��
 * 2.��������һ��������ȡ�Ĵ�ʽ����������0.0172
 * 3.С���İְ���Ҫ��һ���Դ����Ǯ
 * @author astart
 * @create 2017��11��8�� ����4:58:46 
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
		 * 	��һ�������е�Ǯ = �����ȡ��Ǯ\(1+0.172/12);
		 *  ����µ�Ǯ=��һ�������е�Ǯ; 
		 * }
		 */
		//������ 
		Double[] monthMoneyArr = new Double [49];
		monthMoneyArr[48] = 1000d;
		Double monthRate = 0D;
		Double previousMonthMoney = 0D;
		Double currMonthMoney = 1000D;
		monthRate = 0.0171/12;
		for(int i=47;i>0;i--){
			previousMonthMoney = (1000+currMonthMoney)/(1+monthRate);
			currMonthMoney = previousMonthMoney;
			System.out.println("��"+i+"�������д��Ϊ="+currMonthMoney);
			
		}
	}
}
