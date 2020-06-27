
public class Main {
	public void printAnything(Object o) {
		// 何型でもいいから、引数を１つ受け取り画面に表示
		System.out.println(o.toString());
	}

	public static void main(String[] args) {
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);

		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";

		Hero h = new Hero();
		h.name = "湊";
		h.hp = 120;
		System.out.println(h.toString());


		Hero.money = 100;
		System.out.println("Heroのインスタンス生成前");
		System.out.println(Hero.money);

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		h1.money += 300;
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		h2.money += 400;
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}

		// 静的フィールドへのアクセス
		System.out.println("Heroのインスタンス生成後");
		System.out.println(Hero.money);

		Hero.setRandomMoney();
		System.out.println("金額をランダムで生成");
		System.out.println(Hero.money);
	}
}
