/**
 * 
 */
package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zqm
 * 算法：二分法
 * 猜价格使用二分法算法示例
 *
 */
public class GuessPrice {

	/**
	 * 
	 */
	public GuessPrice() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int price = 0 ;// 声明商品价格
		int maxPrice = 0 ;// 声明商品最大价格
		int minPrice = 0;
		int geussPrice = 0;//算出的价格
		int geusstimes = 0;
		System.out.println("请输入商品价格");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Boolean flag = true;
		
		while (flag) {
			price = inputNumber(br);
			System.out.println("请输入商品不超过的最大值");
			maxPrice = inputNumber(br);
			if (maxPrice >= price) {
				flag = false;
			}
		}
		/*
		 * 算法核心
		 */
		while(price != geussPrice){
			geusstimes++;
			System.out.print("geussPrice="+geussPrice);
			if(price<geussPrice){
				System.out.println(" up");
				maxPrice = geussPrice;
				geussPrice = geussPrice-(maxPrice-minPrice)/2;
			}
			if(price>geussPrice){
				System.out.println(" down");
				minPrice = geussPrice;
				geussPrice = (maxPrice-minPrice)/2+geussPrice;
			}
			
		}
		System.out.println("geuss times="+geusstimes+" good price is "+geussPrice);
	}

	private static Integer inputNumber(BufferedReader br) throws IOException {
		String str;
		while ((str = br.readLine()) != null) {
			// System.out.println(str);
			try {
				return Integer.valueOf(str);
			} catch (NumberFormatException e) {
				System.out.println("请重新输入");
			}
		}
		return null;
	}

}
