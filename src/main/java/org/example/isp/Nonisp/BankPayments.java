package org.example.isp.Nonisp;

import java.util.List;

public class BankPayments implements Payment{

    // But here we need only  getStatus, getPayments,  initiatePayments not initiateLoanPayment,initiateRePayment.
    // Here we are violating the Interface segregation principle.
    @Override
    public void initiatePayments() {
        // some code
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
