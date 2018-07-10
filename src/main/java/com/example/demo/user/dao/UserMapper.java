package com.example.demo.user.dao;

import com.example.demo.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Here be dragons
 * Created by haotian on 2018/6/22 下午4:55
 */
@Mapper
public interface UserMapper {

    @Select("select id,name from t_user where id=#{id}")
    User findById(int id);
}
