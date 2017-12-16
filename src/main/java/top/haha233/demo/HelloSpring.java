package top.haha233.demo;

public class HelloSpring {
	private String who=null;

	public void print(){
		System.out.println("我是"+who);
	}
	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}
}
