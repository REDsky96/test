package capsule;

public class Capsule {

	public static void main(String[] args){
		Person taro = new Person ("山田太郎",20);
		System.out.println(taro.getName());
		System.out.println(taro.getAge());

		Person hanako = new Person ("佐藤花子",20);
		System.out.println(hanako.getName());
		System.out.println(hanako.getAge());

	}

}
