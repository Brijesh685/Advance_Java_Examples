package com.as.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.as.dao.personalinfoDAO;
import com.as.form.contactInfoForm;

public class contactInfoAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
				
		//step1 
		contactInfoForm contactInfo = (contactInfoForm)form;
		//, step 2
		System.out.println("The Address  : "+contactInfo.getAddress());
		System.out.println("The City  : "+contactInfo.getCity());
		System.out.println("The State  : "+contactInfo.getState());
		System.out.println("The Country  : "+contactInfo.getCountry());	
		System.out.println("The Phone  : "+contactInfo.getPhone());
		//, step3
		personalinfoDAO dao=new personalinfoDAO();		
		 dao.createContact(contactInfo);
		
		 HttpSession ses = request.getSession();
		 ses.setAttribute("contactInfo",contactInfo);	
		 
		return mapping.findForward("bankInfo");
	}

}
