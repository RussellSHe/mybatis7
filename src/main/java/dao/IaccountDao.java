package dao;

import domain.account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * User: Russell
 * Date: 2019-05-04
 * Time: 14:10
 */
public interface IaccountDao {
    @Select("select * from account")
    @Results(id="accountMap" ,value={
            @Result(id=true,column ="id",property = "id"),
            @Result(column = "uid",property = "uid"),
            @Result(column = "money",property = "money"),
            @Result(column = "uid",property = "user",one=@One(select = "dao.IUserDao.findUserById",fetchType = FetchType.EAGER))

    })
    List<account> findAll();
    @Select("select * from account where uid=#{userId}")
    List<account> findByUid(int id);

}
