package com.osplans.service;

import com.osplans.domain.Loan;
import com.osplans.domain.LoanData;

/**
 * Created by zhj on 2017/9/1 0001.
 */
public interface DataService {

    boolean dataHandle(LoanData loanData);

    Loan findOne(Integer id);

}
