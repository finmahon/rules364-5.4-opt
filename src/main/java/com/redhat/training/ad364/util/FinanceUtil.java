package com.redhat.training.ad364.util;

import com.redhat.training.ad364.model.FinanceAidRequest;

import java.util.Arrays;
import java.util.List;

public class FinanceUtil {

    public static List<FinanceAidRequest> getFinancialAidRequests() {
        try {
            System.out.println("Querying Database for Finance Aid Requests");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // NOOP
        }
        return Arrays.asList(
                new FinanceAidRequest(StudentUtil.createAimeStudent()),
                new FinanceAidRequest(StudentUtil.createJonahStudent()));
    }
}
