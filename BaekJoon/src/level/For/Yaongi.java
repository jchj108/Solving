package level.For;

public class Yaongi {

	private String name; // �̸�
	private int hp; // ü��
	private int atk; // ���ݷ�
	private int def; // ����

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
	
	// ���� ó��
	public void attack(Yaongi cat) {
		System.out.println(name + "��  " + cat.getName() + "�� �����մϴ�.");
		System.out.println(hp - cat.getAtk());
	}

	// ��� ó��

	// ü���� 0 ���� Ȯ��
	public boolean emptyHp() {
		if (hp <= 0) {
			hp = 0;
			return true;
		}
		return false;
	}
}
