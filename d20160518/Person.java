package d20160518;

public class Person {
	private int		eye, ear, lip, nose;
	private int		age;
	private String	name, gender, job;

	Person() {
		eye = 2;
		ear = 2;
		lip = 1;
		nose = 1;
		name = "��ī��";
		gender = "��";
		job = "���ϸ�";
		age = 2;
		System.out.println("Default Constructor of Person");
	}

	public Person(int age, String name, String gender, String job) {
		//this();// �ؿ��ٰ� ������ �ʽ��ϴ�.
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.job = job;
	}

	public int getEye() {
		return eye;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public int getEar() {
		return ear;
	}

	public void setEar(int ear) {
		this.ear = ear;
	}

	public int getLip() {
		return lip;
	}

	public void setLip(int lip) {
		this.lip = lip;
	}

	public int getNose() {
		return nose;
	}

	public void setNose(int nose) {
		this.nose = nose;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public void eat(){
		System.out.println("�Դ´�. ���.");
	}
	
	public void thinkBig(){
		System.out.println("������������");
	}
	
	public void sleep(){
		System.out.println("Zzzzzz....");
	}

	/*
	 * // �⺻������, // �Ű������ִ� ������ Person() { eye = 2; ear = 2; lip = 1; nose = 1;
	 * age = 20; }
	 * 
	 * Person(String name, String gender, String job) { this(); this.name =
	 * name; this.gender = gender; this.job = job; } // 4���� ������ setter, getter
	 * 
	 * void setAge(int age) { this.age = age; }
	 * 
	 * void setGender(String gender) { this.gender = gender; }
	 * 
	 * void setJob(String job) { this.job = job; }
	 * 
	 * void setName(String name) { this.name = name; }
	 * 
	 * void getAge() { System.out.println("���� : " + age); }
	 * 
	 * void getGender() { System.out.println("���� : " + gender); }
	 * 
	 * void getJob() { System.out.println("���� : " + job); }
	 * 
	 * void getName() { System.out.println("�̸� : " + name); }
	 */

}
