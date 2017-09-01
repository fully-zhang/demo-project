package com.osplans.mapper;

import com.osplans.domain.Loan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanMapper {
    int deleteByPrimaryKey(Integer loanid);

    int insert(Loan record);

    int insertSelective(Loan record);

    Loan selectByPrimaryKey(Integer loanid);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}