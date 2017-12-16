package top.haha233.demo;

import java.util.Arrays;
import java.util.List;

public class Collection {
	private String[] aryStr;
	private List<String> listStr;
	private List<Role> listRole;

	public String[] getAryStr() {
		return aryStr;
	}

	public void setAryStr(String[] aryStr) {
		this.aryStr = aryStr;
	}

	public List<String> getListStr() {
		return listStr;
	}

	public void setListStr(List<String> listStr) {
		this.listStr = listStr;
	}

	public List<Role> getListRole() {
		return listRole;
	}

	public void setListRole(List<Role> listRole) {
		this.listRole = listRole;
	}

	@Override
	public String toString() {
		return "Collection{" +
				"aryStr=" + Arrays.toString(aryStr) +
				", listStr=" + listStr +
				", listRole=" + listRole +
				'}';
	}
}
