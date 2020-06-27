
public class Hero {
	String name;
	int hp;
	// 静的フィールド
	static int money;

	public String toString() {
		return "名前:"+ this.name+"/HP:"+this.hp;
	}

	// equals()をオーバーライド
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero)o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}

	// 静的メソッド(クラスメソッド)
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random()*1000);
	}
}
