package com.as.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.as.dao.personalinfoDAO;
import com.as.form.personalInfoForm;

public class personalInfoAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		//step1 
		personalInfoForm personalInfo = (personalInfoForm)form;
		//, step 2
		System.out.println("The FirstName  : "+personalInfo.getFirstname());
		System.out.println("The Middlename  : "+personalInfo.getMiddlename());
		System.out.println("The Lastname  : "+personalInfo.getLastname());
		System.out.println("The Gender  : "+personalInfo.getGender());		
		//, step3
		personalinfoDAO dao=new personalinfoDAO();		
		 dao.createPersonal(personalInfo);
		
		 HttpSession ses = request.getSession();
		 ses.setAttribute("personalInfo",personalInfo);	
		 
		return mapping.findForward("contactInfo");
	}

}
