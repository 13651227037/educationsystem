package cn.beijing.ssfh.realm;

import cn.beijing.ssfh.util.Md5Utils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * Created by Mr.W on 2017/9/24.
 */
public class CustomCredentialMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        //获取用户凭证
        UsernamePasswordToken usernamePasswordToken  = (UsernamePasswordToken)token;
        //获取用户密码
        String password = String.valueOf(usernamePasswordToken.getPassword());
        //用户密码加密
        String encryptPassword = Md5Utils.encryptPassword(password);
        //从用户信息中取到用户密码（数据库中的）
        Object credentials = info.getCredentials();
        //用户密码对比
        return (credentials.equals(encryptPassword));
    }
}
