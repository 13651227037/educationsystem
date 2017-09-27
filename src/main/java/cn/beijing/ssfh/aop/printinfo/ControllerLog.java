package cn.beijing.ssfh.aop.printinfo;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.logging.Logger;

;

/**
 * Created by Mr.W on 2017/9/16.
 */
public class ControllerLog {
    private final Logger logger= Logger.getLogger("ControllerLog");

    public void before(JoinPoint joinpoint){
        logger.info("调用"+joinpoint.getTarget()+"de"+joinpoint.getSignature().getName()+"参数"+
                Arrays.toString(joinpoint.getArgs()));
    }

    public void after(JoinPoint jp ,Object result){
        logger.info("调用："+jp.getTarget()+"的"+jp.getSignature().getName()+"方法："+
                "方法返回值："+result);
    }


}
