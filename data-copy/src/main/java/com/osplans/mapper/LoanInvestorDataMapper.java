package com.osplans.mapper;

import com.osplans.domain.LoanInvestorData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanInvestorDataMapper {
    int insert(LoanInvestorData record);

    int insertSelective(LoanInvestorData record);
}