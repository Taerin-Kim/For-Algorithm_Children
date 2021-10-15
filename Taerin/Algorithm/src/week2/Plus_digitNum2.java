package week2;

import java.util.Scanner;

public class Plus_digitNum2 {

	public static void main(String[] args) {
		// 각각의 자릿수 더해서 sum값 출력

		System.out.println("자연수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		solution(input);
		System.out.println(solution(input));
	}
	
	static int solution(int N) {
		int answer = 0;
		while (N >= 1) {
			answer += N % 10;
			N /= 10;
		}
		return answer;
	}

}
