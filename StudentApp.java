package TestApp;

import java.io.Serializable;
import java.util.Scanner;

public class StudentApp implements Serializable{
	// StudentApp student=new StudentApp();


	private int id;
	private int age;
	private String div;
	int cnt = 0;

	public StudentApp() {

	}

	public StudentApp(int id, int age, String div) {
		super();
		this.id = id;
		this.age = age;
		this.div = div;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentApp [id=" + id + ", age=" + age + ", div=" + div + "]";
	}

}
