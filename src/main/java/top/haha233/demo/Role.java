package top.haha233.demo;


public class Role {
	private String name;
	private String say;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSay() {
		return say;
	}

	public void setSay(String say) {
		this.say = say;
	}

	@Override
	public String toString(){
		return name+"说：“"+say+"！”";
	}
}
