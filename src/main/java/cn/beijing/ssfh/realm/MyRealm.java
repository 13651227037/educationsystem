package cn.beijing.ssfh.realm;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.services.public_department.public_managerment.Userservice;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * Created by Mr.W on 2017/9/24.
 */
public class MyRealm extends AuthorizingRealm {
    
    @Resource
    private Userservice userservice;

    /**
    * @Description: 权限认证
    * @Author Mr.W
    * @Date 2017/9/24 21:04
    * @version V1.0
    */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        String username = String.valueOf(principalCollection.getPrimaryPrincipal());
        //通过登录时传来的username去数据库查询用户
        Tbuser user = userservice.loginByUsername(username);
        //获取用户信息
        SimpleAuthorizationInfo  simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //查询用户角色，授权角色
        simpleAuthorizationInfo.setRoles(userservice.getRolesByUsername(username));
        //查询用户权限，授权权限
        simpleAuthorizationInfo.setStringPermissions(userservice.getPremissionsByUsername(username));
        return simpleAuthorizationInfo;
    }

    /**
    * @Description: 身份认证
    * @Author Mr.W
    * @Date 2017/9/24 21:04
    * @version V1.0
    */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //从taken凭证中获取用户信息
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        //取到用户名
        String username = String.valueOf(token.getPrincipal());
        //通过数据库查询用户
        Tbuser user = userservice.loginByUsername(username);
        if ( user == null) {
            return  null;
        }
        //封装用户信息
        AuthenticationInfo info = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),getName());
        return info;
    }
}
