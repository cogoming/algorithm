/**
 * 
 */
package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zqm
 * �㷨�����ַ�
 * �¼۸�ʹ�ö��ַ��㷨ʾ��
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
		int price = 0 ;// ������Ʒ�۸�
		int maxPrice = 0 ;// ������Ʒ���۸�
		int minPrice = 0;
		int geussPrice = 0;//����ļ۸�
		int geusstimes = 0;
		System.out.println("��������Ʒ�۸�");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Boolean flag = true;
		
		while (flag) {
			price = inputNumber(br);
			System.out.println("��������Ʒ�����������ֵ");
			maxPrice = inputNumber(br);
			if (maxPrice >= price) {
				flag = false;
			}
		}
		/*
		 * �㷨����
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
				System.out.println("����������");
			}
		}
		return null;
	}

}
