package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �㷨˳��-쳲���������
 * Fibonacci Sequence
 * @author astart
 * @create 2017��11��8�� ����3:56:28 
 *
 */
public class FibonacciSequence {

	public FibonacciSequence() {
		
	}
	public static void main(String[] args) throws IOException {
		/*
		 *1.�����·�
		 *2.�����������·ݺ󣬵���������
		 *
		 */
		//�����·ݣ���У��
		//�����·ݲ�����Ĭ��ֵ
		int month = 12;
		//��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String consolStr = "";
		System.out.println("����������Ҫ�������������·�");
		while((consolStr = br.readLine())!=null){
			try {
				month = Integer.valueOf(consolStr);
				break;
			}catch(NumberFormatException e){
				System.out.println("�·�ֻ�ܲ����֣����������룡");
			}
		}
		
		//����������������ʼֵΪ1
		int beforeLastMonth = 0;
		int lastMonth = 0;
		int currMonth = 1;
		//�������ӵ�������
		for(int i=1;i<=month;i++){
			beforeLastMonth = lastMonth;
			lastMonth = currMonth;
			currMonth = lastMonth+beforeLastMonth;
			System.out.println(i+"���º������ܹ�"+currMonth+"��");
		}
		System.out.println(month+"���º������ܹ�"+currMonth+"��");
	}
}
