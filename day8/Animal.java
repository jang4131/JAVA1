package day10;

import java.util.Random;
import java.util.Scanner;

public class Animal {
	
	static String[] arQuiz = {
			"Q.다음 중 나쁜 어린이는?\n"
			+ "1.철수 : 엄마 설거지를 도와 드렸어요.\n"
			+ "2.영희 : 아빠 담배가 다 떨어져서 사왔어요\n"
			+ "3.민수 : 짐이 많은 할머니를 도와 드렸어요.\n"
			+ "4.은혜 : 하나 남은 사탕을 동생에게 주었어요",
			"Q.총 10조각의 케이크가 있다. 철수가 1조각을 먹고\n"
			+ "영희가 8조각을 먹었다. 민수는 3조각의 케이크를 가져와서\n"
			+ "4조각을 먹었다. 남은 케이크는 몇 조각일까요?\n"
			+ "1. 10조각\n"
			+ "2. 5조각\n"
			+ "3. 2조각\n"
			+ "4. 남은 케이크가 없어요",
			"Q.다음 중 동물 울음소리로 알맞게 연결되지 않은 것은?\n"
			+ "1.호랑이 - 어흥\n"
			+ "2.고양이 - 멍멍\n"
			+ "3.강아지 - 으르렁\n"
			+ "4.닭 - 꼬끼오"
	};
	static int[] arAnswer = {2, 4, 2};
	
	//이름, 체력, 먹이종류, 먹이개수
	String name;
	int hp;
	String feed;
	int feed_cnt;
//	long time;
	
	public Animal() {}

	public Animal(String name, int hp, String feed, int feed_cnt) {
		this.name = name;
		this.hp = hp;
		this.feed = feed;
		this.feed_cnt = feed_cnt;
	}
	
	//밥먹기(먹이개수 검사, 먹이개수 1감소, 체력 1증가)
	boolean eat() {
		if(feed_cnt > 0) {
			feed_cnt--;
			hp++;
			return true;
		}
		return false;
	}
	//잠자기(3초간 멈춘 후 체력 1 증가)
	void sleep(long time) {
		try {Thread.sleep(time);} catch (InterruptedException e) {;}
//		hp += (int)((time * 0.001) / 3);
		hp++;
	}
	//산책하기(무조건 체력 1 감소, 체력 검사, 랜덤한 퀴즈 출제 후 정답시 먹이개수 2 증가, 오답시 체력 1 감소)
	boolean walk() {
		if(hp > 1) {
			hp--;
			return true;
		}
		return false;
	}
	//static 메소드에서는 일반 변수는 사용할 수 없으며,
	//반드시 static 필드만 사용이 가능하다.
	static boolean checkAnswer(int idx, int choice) {
		if(arAnswer[idx] == choice) {
			return true;
		}
		return false;
	}
	
	//소스코드 간결화
	void activeEat() {
		if(this.eat()) {
			System.out.println("냠냠 맛있어~");
			System.out.println(this.name + "이(가) "
					+ this.feed + "을(를) 1개 먹었어요!");
			System.out.println("남은 " + this.feed + " 개수 : " 
					+ this.feed_cnt + "개");
			System.out.println(this.name + " 체력 : " + this.hp);
		}else {
			System.out.println("먹이가 부족해요ㅠㅠ. 산책을 떠나보세요~");
		}
	}
	
	void activeSleep(long time) {
		System.out.println(this.name + " 자는 중...\n"
				+ "소요시간 : " + time / 1000 + "초");
		this.sleep(time);
		System.out.println(this.name + "이(가) 자고 일어났어요!");
		System.out.println(this.name + " 체력 : " + this.hp);
	}
	
	void activeWalk(long time) {
		if(this.walk()) {
			Random r = new Random();
			Scanner sc = new Scanner(System.in);
			int quiz_choice = 0;
			int idx = r.nextInt(3);
			System.out.println(arQuiz[idx]);
			quiz_choice = sc.nextInt();
			
			if(Animal.checkAnswer(idx, quiz_choice)) {
				this.feed_cnt += 2;
				System.out.println("정답! " + this.feed + "을(를) 2개 얻었어요!");
				System.out.println("현재 " + this.feed + " 개수 : " 
						+ this.feed_cnt + "개");
			}else {
				System.out.println("오답ㅠㅠ");
				this.hp--;
				if(this.hp == 0) {
					System.out.println("체력이 부족해요!!!");
					this.activeSleep(time);
				}
			}
		}else {
			System.out.println("체력이 부족해요ㅠㅠ. 잠을 자고 오세요!");
		}
	}
	
	void activeInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("체력 : " + this.hp);
		System.out.println(this.feed + " 개수 : " + this.feed_cnt + "개");
	}
	
	void activeAnimal_game() {
		Animal dog = new Animal("바둑이", 7, "개 껌", 3);
		Animal cat = new Animal("나비", 4, "생선", 6);
		Animal pig = new Animal("꿀꿀이", 2, "옥수수", 8);
		
		Animal[] arAnimal = {dog, cat, pig};
		
//		Animal[] arAnimal = new Animal[3];
//		arAnimal[0] = dog;
//		arAnimal[0] = cat;
//		arAnimal[0] = pig;
		
		String title = "★모여라 셀럽 동물★";
		String main_msg = "[캐릭터를 선택하세요]\n1.바둑이\n2.나비\n3.꿀꿀이\n4.게임 종료";
		String active_msg = "1.밥먹기\n2.잠자기\n3.산책하기\n4.내 정보\n5.캐릭터 다시 고르기";
		
		int char_choice = 0;
		int active_choice = 0;
		
		final long time = 3000;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(title);
			System.out.println(main_msg);
			
			char_choice = sc.nextInt();
			
			if(char_choice == 4) {break;}
			if(char_choice < 1 || char_choice > 3) { continue;}
			
			while(true) {
				Animal chosen_animal = arAnimal[char_choice - 1];
				System.out.println(active_msg);
				active_choice = sc.nextInt();
				
				if(active_choice == 5) {break;}
				
				switch(active_choice) {
				//먹기
				case 1:
					chosen_animal.activeEat();
					break;
				//잠자기
				case 2:
					chosen_animal.activeSleep(time);
					break;
				//산책하기
				case 3:
					chosen_animal.activeWalk(time);
					break;
				//내 정보
				case 4:
					chosen_animal.activeInfo();
					break;
				//그 외
				default:
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Animal().activeAnimal_game();
	}
}










