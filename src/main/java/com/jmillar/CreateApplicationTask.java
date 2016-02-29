package com.jmillar;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import com.jmillar.domain.LoanApplication;

public class CreateApplicationTask implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LoanApplication la = new LoanApplication();
		la.setCreditCheckOk((Boolean) execution
				.getVariable("creditCheckOk"));
		la.setCustomerName((String)
				execution.getVariable("name"));
		la.setIncome((Long) execution.getVariable("income"));
		la.setRequestedAmount((Long)
				execution.getVariable("loanAmount"));
		la.setEmailAddress((String)
				execution.getVariable("emailAddress"));
		execution.setVariable("loanApplication", la);

	}
}
