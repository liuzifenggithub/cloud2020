package com.test.dao;


import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class AppDao {

    public AppDao() {
        System.out.println("构造");
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }

    public void query(){
        System.out.println("query");
    }
}
