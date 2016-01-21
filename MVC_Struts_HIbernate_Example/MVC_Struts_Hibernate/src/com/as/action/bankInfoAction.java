package com.as.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.as.dao.personalinfoDAO;
import com.as.form.bankInfoForm;


public class bankInfoAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
				
		//step1 
		bankInfoForm bankInfo = (bankInfoForm)form;
				//, step 2
				System.out.println("The Bankname  : "+bankInfo.getBankname());
				System.out.println("The Account  : "+bankInfo.getAccount());
				System.out.println("The Ssn  : "+bankInfo.getSsn());
				//, step3
				 personalinfoDAO dao=new personalinfoDAO();		
				 dao.createBank(bankInfo);
				
				 HttpSession ses = request.getSession();
				 ses.setAttribute("bankInfo",bankInfo);
				 /* 
				 personalinfoDAO dao=new personalinfoDAO();		
				 personalInfoForm personalinfo = new personalInfoForm();
			    personalinfo = (personalInfoForm)ses.getAttribute("personalInfo");  
				 dao.create(personalinfo); */
				
				
				 
				return mapping.findForward("success"); // is not run gives an error because of taglib
				//return mapping.findForward("newfile"); // it will run without taglib 
			
	}

}
