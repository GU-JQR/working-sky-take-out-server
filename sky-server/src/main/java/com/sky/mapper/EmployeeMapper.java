package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    @Insert("insert into employee (name,username,password,phone,sex,id_number,creat_time,update_time,create_user,update_time,status)"+
    "value"+
    "#{name},#{username},#{password},#{phone},#{sex},#{idNumber},#{creatTime},#{updateTime},#{createUser},#{updateTime},#{status}")
    void insert(Employee employee);
}
