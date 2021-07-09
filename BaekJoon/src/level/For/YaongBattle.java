package level.For;

import java.util.Scanner;

public class YaongBattle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int hp = Integer.parseInt(sc.nextLine());
		int atk = Integer.parseInt(sc.nextLine());
		int def = Integer.parseInt(sc.nextLine());
		
		String name2 = sc.nextLine();
		int hp2 = Integer.parseInt(sc.nextLine());
		int atk2 = Integer.parseInt(sc.nextLine());
		int def2 = Integer.parseInt(sc.nextLine());

		Yaongi y1 = new Yaongi(name, hp, atk, def);
		Yaongi y2 = new Yaongi(name2, hp2, atk2, def2);
		
		while(true) {
			if(y1.emptyHp() || y2.emptyHp()) {
				break;
			}
		
			y1.attack(y2);
			y2.attack(y1);
		
		}
		
		
	}
}
