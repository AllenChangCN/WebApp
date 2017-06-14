package allen;

import java.io.File;
import java.nio.file.Path;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends  ActionSupport
{
	public String username;
	public String password;
	
	private String tip;
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username=username ;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password= password;
	}
	
	public void setTip(String tip)
	{
		this.tip=tip;
	}
	
	public String getTip()
	{
		return tip;
	}
	
	
	
	public String execute() throws Exception
	{
		if(getUsername().equals("allen")&&getPassword().equals("allen1234"))
		{
			ActionContext.getContext().getSession().put("user",getUsername());
			setTip("¹§Ï²Äã");
			ActionContext.getContext().getSession().put("tip",getTip());
			System.out.println("");
			return SUCCESS;
		}
		if(getUsername().equals("exception"))
		{
			System.out.println("Have throw Exception");
			System.out.println("mmm ");
			throw new java.lang.Exception("java.langÒì³£");
		}
		else
		{
			return ERROR;
		}
	}
	
	public String register() throws Exception
	{
//		setTip("»¶Ó­×¢²á");
//		ActionContext.getContext().getSession().put("tip",getTip());
		return "register";
	}
}
