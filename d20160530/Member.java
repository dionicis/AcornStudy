package d20160530;

import java.io.Serializable;

public class Member implements Serializable {
	int		memNo;
	String	name;
	String	id;
	transient String	pw;
	String	tel;

	public Member() {

	}

	public Member(int memNo, String name, String id, String pw, String tel) {
		super();
		this.memNo = memNo;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
