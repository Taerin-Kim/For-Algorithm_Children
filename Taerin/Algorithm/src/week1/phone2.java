package week1;

public class phone2 {

	public static void main(String[] args) {
		
		System.out.println(solution("01022223333"));
	}
	
	private static String solution(String phone_number) {
		// substring ����ϱ�
		//1. ��ȣ ���̱��ϱ�
		//2. ������ 4�ڸ� ������ *�� �ٲٱ�
		//3. ���
		
		String answer = "";
		//length�� lenght()���� ��Ʈ�������� ���� length();
		
		for(int i = 0; i < phone_number.length()-4; i++) {
				answer += "*";
		}
		
		// substring(start, end) => start���� end-1���� ���� (end�� ��������)
		answer += phone_number.substring(phone_number.length()-4);
		
		return answer;
	}

}
