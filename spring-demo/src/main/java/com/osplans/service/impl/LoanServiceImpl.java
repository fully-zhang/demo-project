package com.osplans.service.impl;

import com.osplans.domain.Loan;
import com.osplans.mapper.LoanMapper;
import com.osplans.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhj on 2017/9/6 0006.
 */

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanMapper loanMapper;

    @Override
    public Loan getLoanById(Integer loanId) {
        return loanMapper.selectByPrimaryKey(loanId);
    }
}
