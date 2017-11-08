package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 算法顺推-斐伯拉契数列
 * Fibonacci Sequence
 * @author astart
 * @create 2017年11月8日 下午3:56:28 
 *
 */
public class FibonacciSequence {

	public FibonacciSequence() {
		
	}
	public static void main(String[] args) throws IOException {
		/*
		 *1.输入月份
		 *2.计算最后最该月份后，的兔子数量
		 *
		 */
		//输入月份，并校验
		//声明月份并给出默认值
		int month = 12;
		//接收输入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String consolStr = "";
		System.out.println("请输入您想要计兔子生长的月份");
		while((consolStr = br.readLine())!=null){
			try {
				month = Integer.valueOf(consolStr);
				break;
			}catch(NumberFormatException e){
				System.out.println("月份只能不数字，请重新输入！");
			}
		}
		
		//声明兔子总数并初始值为1
		int beforeLastMonth = 0;
		int lastMonth = 0;
		int currMonth = 1;
		//计算兔子的最后对数
		for(int i=1;i<=month;i++){
			beforeLastMonth = lastMonth;
			lastMonth = currMonth;
			currMonth = lastMonth+beforeLastMonth;
			System.out.println(i+"个月后，兔子总共"+currMonth+"对");
		}
		System.out.println(month+"个月后，兔子总共"+currMonth+"对");
	}
}
