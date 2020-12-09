package com.test;

import com.test.config.AppConfig;
import com.test.dao.AppDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppDao dao = context.getBean(AppDao.class);
        dao.query();
    }
}
