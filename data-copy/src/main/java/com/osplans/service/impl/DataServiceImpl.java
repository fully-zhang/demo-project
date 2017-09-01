package com.osplans.service.impl;

import com.osplans.domain.Loan;
import com.osplans.domain.LoanData;
import com.osplans.mapper.LoanMapper;
import com.osplans.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhj on 2017/9/1 0001.
 */

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    private LoanMapper loanMapper;

    @Override
    public boolean dataHandle(LoanData loanData) {
        return false;
    }

    @Override
    public Loan findOne(Integer id) {
        return loanMapper.selectByPrimaryKey(id);
    }

}
