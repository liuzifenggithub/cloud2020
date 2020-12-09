package com.test.BeanPostProcessor;

import com.test.dao.AppDao;
import com.test.proxy.TestProxy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;


@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("appDao")){
            System.out.println("MyBeforeInitialization");
            Object o = TestProxy.createProxy(bean.getClass());
            if(o != null){
                return o;
            }
        }


        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("appDao")){
            System.out.println("MyAfterInitialization");

        }
        return bean;
    }
}
