package com.osplans.mapper;

import com.osplans.domain.LoanData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanDataMapper {
    int deleteByPrimaryKey(Integer loanid);

    int insert(LoanData record);

    int insertSelective(LoanData record);

    LoanData selectByPrimaryKey(Integer loanid);

    int updateByPrimaryKeySelective(LoanData record);

    int updateByPrimaryKey(LoanData record);
}