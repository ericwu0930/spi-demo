package com.platform.service;

public class MysqlDataOperator implements IDataOperator{

    @Override
    public void insertData(String str) {

        System.out.println("Mysql insert data:" + str);

    }
}
