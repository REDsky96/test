package java練習２;

public class Java_practice {

	private String name=null;
	private int age=0;

	public Java_practice(){}

	public Java_practice(String name, int age){
		this.name=name;
		this.age=age;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name=name;
	}

	public int getAge(){
		return this.age;
	}

	public void getAge(int age){
		this.age=age;
	}


}
