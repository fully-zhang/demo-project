package com.osplans.mapper;

import com.osplans.domain.UserStatistic;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserStatisticMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserStatistic record);

    int insertSelective(UserStatistic record);

    UserStatistic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserStatistic record);

    int updateByPrimaryKey(UserStatistic record);
}