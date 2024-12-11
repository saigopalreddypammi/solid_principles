package org.example.isp.isp;

import java.util.List;

public class BankPayments implements Bank{
    // Here ISP is satisfied.
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
}
