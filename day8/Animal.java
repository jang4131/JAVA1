package day10;

import java.util.Random;
import java.util.Scanner;

public class Animal {
	
	static String[] arQuiz = {
			"Q.���� �� ���� ��̴�?\n"
			+ "1.ö�� : ���� �������� ���� ��Ⱦ��.\n"
			+ "2.���� : �ƺ� ��谡 �� �������� ��Ծ��\n"
			+ "3.�μ� : ���� ���� �ҸӴϸ� ���� ��Ⱦ��.\n"
			+ "4.���� : �ϳ� ���� ������ �������� �־����",
			"Q.�� 10������ ����ũ�� �ִ�. ö���� 1������ �԰�\n"
			+ "���� 8������ �Ծ���. �μ��� 3������ ����ũ�� �����ͼ�\n"
			+ "4������ �Ծ���. ���� ����ũ�� �� �����ϱ��?\n"
			+ "1. 10����\n"
			+ "2. 5����\n"
			+ "3. 2����\n"
			+ "4. ���� ����ũ�� �����",
			"Q.���� �� ���� �����Ҹ��� �˸°� ������� ���� ����?\n"
			+ "1.ȣ���� - ����\n"
			+ "2.����� - �۸�\n"
			+ "3.������ - ������\n"
			+ "4.�� - ������"
	};
	static int[] arAnswer = {2, 4, 2};
	
	//�̸�, ü��, ��������, ���̰���
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
	
	//��Ա�(���̰��� �˻�, ���̰��� 1����, ü�� 1����)
	boolean eat() {
		if(feed_cnt > 0) {
			feed_cnt--;
			hp++;
			return true;
		}
		return false;
	}
	//���ڱ�(3�ʰ� ���� �� ü�� 1 ����)
	void sleep(long time) {
		try {Thread.sleep(time);} catch (InterruptedException e) {;}
//		hp += (int)((time * 0.001) / 3);
		hp++;
	}
	//��å�ϱ�(������ ü�� 1 ����, ü�� �˻�, ������ ���� ���� �� ����� ���̰��� 2 ����, ����� ü�� 1 ����)
	boolean walk() {
		if(hp > 1) {
			hp--;
			return true;
		}
		return false;
	}
	//static �޼ҵ忡���� �Ϲ� ������ ����� �� ������,
	//�ݵ�� static �ʵ常 ����� �����ϴ�.
	static boolean checkAnswer(int idx, int choice) {
		if(arAnswer[idx] == choice) {
			return true;
		}
		return false;
	}
	
	//�ҽ��ڵ� ����ȭ
	void activeEat() {
		if(this.eat()) {
			System.out.println("�ȳ� ���־�~");
			System.out.println(this.name + "��(��) "
					+ this.feed + "��(��) 1�� �Ծ����!");
			System.out.println("���� " + this.feed + " ���� : " 
					+ this.feed_cnt + "��");
			System.out.println(this.name + " ü�� : " + this.hp);
		}else {
			System.out.println("���̰� �����ؿ�Ф�. ��å�� ����������~");
		}
	}
	
	void activeSleep(long time) {
		System.out.println(this.name + " �ڴ� ��...\n"
				+ "�ҿ�ð� : " + time / 1000 + "��");
		this.sleep(time);
		System.out.println(this.name + "��(��) �ڰ� �Ͼ���!");
		System.out.println(this.name + " ü�� : " + this.hp);
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
				System.out.println("����! " + this.feed + "��(��) 2�� ������!");
				System.out.println("���� " + this.feed + " ���� : " 
						+ this.feed_cnt + "��");
			}else {
				System.out.println("����Ф�");
				this.hp--;
				if(this.hp == 0) {
					System.out.println("ü���� �����ؿ�!!!");
					this.activeSleep(time);
				}
			}
		}else {
			System.out.println("ü���� �����ؿ�Ф�. ���� �ڰ� ������!");
		}
	}
	
	void activeInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("ü�� : " + this.hp);
		System.out.println(this.feed + " ���� : " + this.feed_cnt + "��");
	}
	
	void activeAnimal_game() {
		Animal dog = new Animal("�ٵ���", 7, "�� ��", 3);
		Animal cat = new Animal("����", 4, "����", 6);
		Animal pig = new Animal("�ܲ���", 2, "������", 8);
		
		Animal[] arAnimal = {dog, cat, pig};
		
//		Animal[] arAnimal = new Animal[3];
//		arAnimal[0] = dog;
//		arAnimal[0] = cat;
//		arAnimal[0] = pig;
		
		String title = "�ڸ𿩶� ���� ������";
		String main_msg = "[ĳ���͸� �����ϼ���]\n1.�ٵ���\n2.����\n3.�ܲ���\n4.���� ����";
		String active_msg = "1.��Ա�\n2.���ڱ�\n3.��å�ϱ�\n4.�� ����\n5.ĳ���� �ٽ� ����";
		
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
				//�Ա�
				case 1:
					chosen_animal.activeEat();
					break;
				//���ڱ�
				case 2:
					chosen_animal.activeSleep(time);
					break;
				//��å�ϱ�
				case 3:
					chosen_animal.activeWalk(time);
					break;
				//�� ����
				case 4:
					chosen_animal.activeInfo();
					break;
				//�� ��
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










