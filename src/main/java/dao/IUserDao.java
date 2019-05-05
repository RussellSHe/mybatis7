package dao;


import domain.user;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @ProjectName: mybatis1
 * @Package: dao
 * @ClassName: IUserDao
 * @Description:
 * @Author: zengyanbo
 * @CreateDate: 2019-04-28 18:06
 * @UpdateDate: 2019-04-28 18:06
 * @Version: 1.0
 */
@CacheNamespace(blocking = true )
public interface IUserDao {
 @Select("select * from user")
 //如果 实体类属性值与表字段不一致 可用以下注解
 @Results(id="userMap",value = {
         @Result(id=true,column = "id",property = "userId"),
         @Result(column = "name",property = "userName"),
         @Result(column = "sex",property = "userSex"),
         @Result(column = "address",property = "address"),
         @Result(column = "birthday",property = "birthday"),
         @Result(column = "id",property = "accounts",
         many = @Many(select="dao.IaccountDao.findByUid",fetchType= FetchType.LAZY))
 })
    List<user> findAll();
 @Select("select * from user where id=#{id}")
 @ResultMap(value = {"userMap"})
 user findUserById(int id);
@Insert("insert into user (username,address,sex,birthday) values(#{username},#{address},#{sex},#{birthday})")
    void saveUser(user user);
@Update("update user set username=#{username},sex=#{sex},birthday=#{birthday},address=#{address}")
    void updateUser(user user);
@Delete("delete from user where id=#{id}")
    void deleteUser(int id);
@Select("select * from user where username like #{username}")
    List<user> findUserByName(String name);

}
