package com.osplans.mapper;

import com.osplans.domain.LoanInvestor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanInvestorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoanInvestor record);

    int insertSelective(LoanInvestor record);

    LoanInvestor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoanInvestor record);

    int updateByPrimaryKey(LoanInvestor record);
}