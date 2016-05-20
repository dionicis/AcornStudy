package d20160517.HW;

public class Animal {
	/*
	 * Hw2 *
	 */
	// String name;
	// int age;
	//
	// Animal(String name, int age) {
	// this.name = name;
	// this.age = age;
	// }
	//
	// public void show() {
	// System.out.println(name + "는(은) " + age + " 살입니다.");
	// }

	/*
	 * Hw4 *
	 */
	private String	name;
	private int		age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setBoth(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}
	
	public void show() {
		System.out.println(name + "는(은) " + age + " 살입니다.");
	}
}
