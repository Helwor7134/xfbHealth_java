package top.helwor.entity;

public class LoginInfo {

    /**
     * 要打卡的人员对象，方便批量操作
     */

    private String phone;
    private String address;
    private String cookie;

    public LoginInfo() {
    }

    public LoginInfo(String phone, String address, String cookie) {
        this.phone = phone;
        this.address = address;
        this.cookie = cookie;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }
}
