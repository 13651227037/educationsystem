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

        UsernamePasswordToken usernamePasswordToken  = (UsernamePasswordToken)token;
        String password = String.valueOf(usernamePasswordToken.getPassword());
        String encryptPassword = Md5Utils.encryptPassword(password);
        Object credentials = info.getCredentials();
        return (credentials.equals(encryptPassword));
    }
}
