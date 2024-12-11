package org.example.isp.isp;

import java.util.List;

public class LoanPayments implements Loan{

    // Here the ISP is satisfied.
    @Override
    public void initiateLoanPayment() {

    }

    @Override
    public void initiateRePayment() {

    }

    @Override
    public Object getStatus() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return List.of();
    }
}
