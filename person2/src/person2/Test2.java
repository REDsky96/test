package person2;

public class Test2 {

	public static void main(String[] args){

		//実行するファイル

		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);


		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person saburo = new Person("sabro");
		saburo.age=0;
		System.out.println(saburo.name);
		System.out.println(saburo.age);



		Person unnamed = new Person(25);
		unnamed.name = "名前なし";
		System.out.println(unnamed.name);
		System.out.println(unnamed.age);


		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.age);
		System.out.println(hanako.name);

	}

}
