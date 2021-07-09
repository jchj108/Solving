package level.For;

public class Yaongi {

	private String name; // 이름
	private int hp; // 체력
	private int atk; // 공격력
	private int def; // 방어력

	public Yaongi() {
	}

	public Yaongi(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	// 공격 처리
	public void attack(Yaongi cat) {
		System.out.println(name + "이  " + cat.getName() + "을 공격합니다.");
		System.out.println(hp - cat.getAtk());
	}

	// 방어 처리

	// 체력이 0 인지 확인
	public boolean emptyHp() {
		if (hp <= 0) {
			hp = 0;
			return true;
		}
		return false;
	}
}
