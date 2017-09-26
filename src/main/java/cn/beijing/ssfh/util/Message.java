package cn.beijing.ssfh.util;

/**
 * Created by lenovo on 2017/9/24
 * Author 陈智炜
 */
public class Message {
    private String code;
    private String msg;

    public static Message success(){
        Message msg=new Message();
        msg.setCode("0000");
        msg.setMsg("操作成功");
        return msg;
    }

    public static Message error() {
        Message msg = new Message();
        msg.setCode("0001");
        msg.setMsg("操作失败");
        return msg;
    }

    public static Message unknown() {
        Message msg = new Message();
        msg.setCode("0002");
        msg.setMsg("未找到该用户！");
        return msg;
    }

    public static Message wrongpwd() {
        Message msg = new Message();
        msg.setMsg("用户名或密码错误！");
        msg.setCode("0003");
        return msg;
    }

    public static Message otherWrong() {
        Message msg = new Message();
        msg.setCode("0004");
        msg.setMsg("登陆失败！");
        return msg;
    }
    public static Message loginout() {
        Message msg = new Message();
        msg.setCode("0005");
        msg.setMsg("退出成功！");
        return msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
