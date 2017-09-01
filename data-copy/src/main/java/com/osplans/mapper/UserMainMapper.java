package com.osplans.mapper;

import com.osplans.domain.UserMain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMainMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserMain record);

    int insertSelective(UserMain record);

    UserMain selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserMain record);

    int updateByPrimaryKey(UserMain record);
}