package com.jk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TestMapper {
    @Select("select count(*) from t_user")
    int getCount();
}
