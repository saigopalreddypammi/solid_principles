package org.example.isp.Nonisp;

import java.util.List;

public class LoanPayment implements Payment{

    // But here we need only initiateLoanPayment, initiateRepayment, getStatus, getPayments, not the initiatePayments.
    // Here we are violating the Interface segregation principle.
    @Override
    public void initiatePayments() {

    }

    @Override
    public Object getStatus() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return List.of();
    }

    @Override
    public void initiateLoanPayment() {

    }

    @Override
    public void initiateRePayment() {

    }
}
