package cn.hr.action.demo;

import com.opensymphony.xwork2.ActionSupport;

public class HellowAction extends ActionSupport {
	
	/**
	 * 每次访问Servlet，都会执行service()方法
	 * 每次访问action，默认执行名称excute方法
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("execute....");
		return "ok";
	}
}
