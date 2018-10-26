package java練習２;

public class Test {
  public static void main(String[] args){
	  Java_practice sato = new Java_practice("佐藤",20);
	  System.out.println(sato.getName());
	  System.out.println(sato.getAge());
	  sato.talk();

	  sato.setName("hanako");
	  System.out.println(sato.getName());

  }
}
