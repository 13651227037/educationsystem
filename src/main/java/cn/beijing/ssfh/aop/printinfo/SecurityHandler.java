package cn.beijing.ssfh.aop.printinfo;

/**
 * Created by Mr.W on 2017/9/26.
 */

import org.aspectj.lang.JoinPoint;

/**
     * 定义aspect，将横切点模块化
     *
     * @author mengh
     *
     */

    public class SecurityHandler {

        /**
         * 操作日志
         *
         * @param joinPoint
         */
        public void checkSecurity(JoinPoint joinPoint) {
            System.out.println(joinPoint.getTarget().getClass() + "类"
                    + joinPoint.getSignature().getName());

        }

        /**
         * 异常日志
         *
         *@param jp
         *@param ex
         */

        public void doThrowing(JoinPoint jp, Throwable ex) {
            System.out.println(jp.getTarget().getClass() + "类的方法的" + jp.getSignature().getName() + "可以记录程序运行时候抛出的异常信息: " + ex.getMessage());
        }

}
