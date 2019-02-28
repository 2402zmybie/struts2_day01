package cn.hr.action.demo;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	public String add() {
		System.out.println("UserAction add.....");
		return NONE;
	}
	
	public void delete() {
		System.out.println("UserAction delete.....");
	}
}	
