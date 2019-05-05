package domain;

import java.io.Serializable;

/**
 * User: Russell
 * Date: 2019-05-04
 * Time: 14:09
 */
public class account implements Serializable {
    private int id;
    private int uid;
    private double money;
    //一对一关系映射：从表实体包含主表实体的对象引用
    private user user;

    public domain.user getUser() {
        return user;
    }

    public void setUser(domain.user user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}
