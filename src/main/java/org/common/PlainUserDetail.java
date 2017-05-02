package org.common;

/**
 * Created by zhongdepeng on 2017/4/27.
 */
public class PlainUserDetail implements java.io.Serializable {
    public static final PlainUserDetail SYS = new PlainUserDetail(-1l, "SYS", "INFOSKY");

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 所属公司代码
     */
    private String companyCode;

    /**
     * 所属公司代码
     */
    private String cityCode;

    public PlainUserDetail() {}

    public PlainUserDetail(Long userId, String username, String companyCode) {
        this.userId = userId;
        this.username = username;
        this.companyCode = companyCode;
    }

    public static PlainUserDetail getSYS() {
        return SYS;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
