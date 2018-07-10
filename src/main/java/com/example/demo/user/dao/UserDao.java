package com.example.demo.user.dao;

import com.example.demo.user.entity.User;
import com.piaoniu.pndao.annotations.DaoGen;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Here be dragons
 * Created by haotian on 2018/6/22 下午4:38
 */
@DaoGen
@Mapper
public interface UserDao {


    User findById(int id);

    User findByName(String name);

    User findByIdAndName(@Param("id")  int id , @Param("name")  String name);


   // @Select("select `name`, `id` from t_user where `id` = #{id} order by id ASC ")
    User testXXX(@Param("id")  int id );

}
