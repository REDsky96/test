package person;

public class Test {

	public static void main(String[] args){
		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="000-000-0000";
		jiro.address= "東京都";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		Person hanako = new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="XXX-XXX-XXXX";
		hanako.address="神奈川";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person koki = new Person();
		koki.name="井上";
		koki.age=23;
		koki.phoneNumber="111-111-1111";
		koki.address="埼玉";
		System.out.println(koki.name);
		System.out.println(koki.age);
		System.out.println(koki.phoneNumber);
		System.out.println(koki.address);

		jiro.talk();
		jiro.walk();
		jiro.run();






	}

}
