package cn.hr.action.demo;

import com.opensymphony.xwork2.ActionSupport;

public class MethodAction extends ActionSupport {
	
	public String add() {
		System.out.println("MethodAction add.....");
		return NONE;
	}
	
	public void update() {
		System.out.println("MethodAction update.....");
	}
}
