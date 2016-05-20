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
		name = "피카츄";
		gender = "남";
		job = "포켓몬";
		age = 2;
		System.out.println("Default Constructor of Person");
	}

	public Person(int age, String name, String gender, String job) {
		//this();// 밑에다가 써주지 않습니다.
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
		System.out.println("먹는다. 고기.");
	}
	
	public void thinkBig(){
		System.out.println("생각생각생각");
	}
	
	public void sleep(){
		System.out.println("Zzzzzz....");
	}

	/*
	 * // 기본생성자, // 매개변수있는 생성자 Person() { eye = 2; ear = 2; lip = 1; nose = 1;
	 * age = 20; }
	 * 
	 * Person(String name, String gender, String job) { this(); this.name =
	 * name; this.gender = gender; this.job = job; } // 4개의 변수의 setter, getter
	 * 
	 * void setAge(int age) { this.age = age; }
	 * 
	 * void setGender(String gender) { this.gender = gender; }
	 * 
	 * void setJob(String job) { this.job = job; }
	 * 
	 * void setName(String name) { this.name = name; }
	 * 
	 * void getAge() { System.out.println("나이 : " + age); }
	 * 
	 * void getGender() { System.out.println("성별 : " + gender); }
	 * 
	 * void getJob() { System.out.println("직업 : " + job); }
	 * 
	 * void getName() { System.out.println("이름 : " + name); }
	 */

}
