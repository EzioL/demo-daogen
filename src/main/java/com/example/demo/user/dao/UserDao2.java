package com.example.demo.user.dao;

import com.example.demo.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Here be dragons
 * Created by haotian on 2018/6/22 下午4:05
 */
@Mapper
public interface UserDao2 {



    User findById(int id);


}
