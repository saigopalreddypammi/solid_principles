package org.example.isp.Nonisp;

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object getStatus();
    List<Object> getPayments();
    // we have some requirement which is loan. we are adding some methods.
    void initiateLoanPayment();
    void initiateRePayment();
}
