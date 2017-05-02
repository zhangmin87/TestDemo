package org.dto.student;



import java.io.Serializable;

/**
 * Created by zhangmin on 2017/4/20.
 */
public class StudentResultDTO implements Serializable {

    /**
     * 学号
     */
    private String sNo;

    /**
     * 姓名
     */
    private char sName;

    /**
     * 年龄
     */
    private int age;
    /**
     * 部门
     */
    private String dept;

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public char getsName() {
        return sName;
    }

    public void setsName(char sName) {
        this.sName = sName;
    }
}
