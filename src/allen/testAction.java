package allen;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class testAction extends ActionSupport implements ServletRequestAware
{
	private HttpServletRequest request;
	private String[] checkbox;
	
	public void setCheckbox(String[] checkbox)
	{
		this.checkbox=checkbox;
	}

	@Override
	public void setServletRequest(HttpServletRequest request)
	{
		// TODO Auto-generated method stub
		this.request=request;
	}
	
	public String execute() throws Exception
	{
		//
		for(int i =0;i<checkbox.length;i++)
		{
			System.out.println(checkbox[i]);
		}		
		
		//
		String[] strs=this.request.getParameterValues("checkbox");
		for(int i=0;i<strs.length;i++)
		{
			System.out.println(strs[i]);
		}
		
		//
		Map map=this.request.getParameterMap();
		Collection str=map.values();		
		return null;
	}

}
