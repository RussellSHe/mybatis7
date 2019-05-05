package domain;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: mybatis1
 * @Package: domain
 * @ClassName: user
 * @Description:
 * @Author: zengyanbo
 * @CreateDate: 2019-04-28 18:03
 * @UpdateDate: 2019-04-28 18:03
 * @Version: 1.0
 */

public class user implements Serializable {
    private int userId;
    private String userName;
    private Date birthday;
    private String userSex;
    private String address;
    private List<account> accounts;

    public List<account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<account> accounts) {
        this.accounts = accounts;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", userSex='" + userSex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}