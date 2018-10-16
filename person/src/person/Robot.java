package person;

public class Robot {

	public static void main(String[] args){

		Person aibo = new Person();
		aibo.name= "aibo";
		System.out.println(aibo.name);

		aibo.talk();
		aibo.walk();
		aibo.run();

		Person asimo = new Person();
		asimo.name= "asimo";
		System.out.println(asimo.name);

		asimo.talk();
		asimo.walk();
		asimo.run();

		Person pepper = new Person();
		pepper.name = "pepper";
		System.out.println(pepper.name);

		pepper.talk();
		pepper.walk();
		pepper.run();

		Person doraemon = new Person();
		doraemon.name="doraemon";
		System.out.println(doraemon.name);

		doraemon.talk();
		doraemon.walk();
		doraemon.run();

	}



}
