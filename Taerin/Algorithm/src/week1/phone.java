package week1;

import java.util.Scanner;

public class phone {

	public static void main(String[] args) {
		//charAt i��° �ε����� ��ȯ �� �������� ���� �ҷ������� 
		//System.out.println("���ڸ� ������ �ڵ��� ��ȣ�� �Է����ּ���");
		//Scanner sc = new Scanner(System.in);
		//String num = sc.nextLine();
		
		
		System.out.println(solution("01022223333"));

	}
	
	private static String solution(String phone_number) {
		
		//1. ��ȣ ���̱��ϱ�
		//2. ������ 4�ڸ� ������ *�� �ٲٱ�
		//3. ���
		
		String answer = "";
		//length�� lenght()���� ��Ʈ�������� ���� length();
		
		for(int i = 0; i < phone_number.length(); i++) {
			if(i < phone_number.length()-4) {
				answer += "*";
			} else {
				answer += phone_number.charAt(i);
			}
		}
		
		return answer;
	}

}
