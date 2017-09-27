package cn.beijing.ssfh.util;

/**
 * Created by 79414 on 2017/8/28.
 */
public class Mesage {
    private String code;
    private String msg;

    public static Mesage base(Integer n) {
        Mesage mesage=null;
        if(n>0){
            mesage=Mesage.success();
        }else {
            mesage=Mesage.error();
        }
        return mesage;
    }
    public static Mesage success(){
        Mesage mesage = new Mesage();
        mesage.setCode("0000");
        mesage.setMsg("操作成功");
        return mesage;

    }
    public static Mesage error(){
        Mesage mesage = new Mesage();
        mesage.setCode("0001");
        mesage.setMsg("操作失败");
        return mesage;

    }
    @Override
    public String toString() {
        return "Mesage{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
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

    public Mesage(String code, String msg) {

        this.code = code;
        this.msg = msg;
    }

    public Mesage() {

    }
}
