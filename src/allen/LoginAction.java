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
			setTip("��ϲ��");
			ActionContext.getContext().getSession().put("tip",getTip());
			System.out.println("hellow");
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}
