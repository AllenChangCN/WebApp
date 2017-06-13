package allen;

import com.opensymphony.xwork2.ActionSupport;

public class test1Action extends ActionSupport
{
	private String str;
	public void setsername(String str1)
	{
		this.str=str1;

	}
	
	
	public String execute() throws Exception
	{
		System.out.println(this.str);
		return null;
	}

}
