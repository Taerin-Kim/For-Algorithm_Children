package week2;

import java.util.Scanner;

public class Plus_digitNum {

	public static void main(String[] args) {
		// �ڸ��� ���ϱ�
		// 3�ڸ� ���� ���Ϸ��� n/100
		// 2�� �ڸ��� n/10
		// ex)365�� ���Ѵ� ġ�� ���� 3+6+5 = 14
		// ex) 365/100 ���� 3 �������� 65, �ٽ� /10 �� 6, ������ 5
		// �׸����� �� ���ϱ�

		System.out.println("�ڿ����� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(solution(input));
	}

	private static String solution(String num) {
		
		String answer = "";
		String[] arr = num.split("");
		
		for(int i = 0; i < arr.length; i++) {
			//answer += arr[i].length(); (����)
			//answer += parseInt(arr[i]); (����)
			//---------------------------------���� �������� �����غ���
			
		}
		return answer;
	}

	private static String parseInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
