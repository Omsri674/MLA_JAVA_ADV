package com.test;

import java.util.Date;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Mytag extends TagSupport 
{

	@Override
	public int doStartTag() {
		JspWriter out = null;
		
		try {
			
			out = pageContext.getOut();
			Date date = new Date();
			
			out.println("Current date"+date);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
	
}
