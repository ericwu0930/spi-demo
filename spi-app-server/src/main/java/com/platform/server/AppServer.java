package com.platform.server;

import com.platform.service.IDataOperator;
import com.platform.service.MysqlDataOperator;
import com.platform.service.OracleDataOperator;

import java.util.Iterator;
import java.util.ServiceLoader;

public class AppServer {

    public static void main(String[] args) {

        ServiceLoader<IDataOperator> serviceLoader = ServiceLoader.load(IDataOperator.class); //加载服务

        Iterator<IDataOperator> iterator = serviceLoader.iterator(); //迭代所用服务
        while (iterator.hasNext()) {

            IDataOperator dataOperator = iterator.next();

            if(dataOperator instanceof MysqlDataOperator)
            {
                System.out.println("调用mysql服务");

                // 调用mysql服务
                dataOperator.insertData("test data");

            }
            else if (dataOperator instanceof OracleDataOperator)
            {
                System.out.println("调用Oracle服务");

                // 调用Oracle服务
                dataOperator.insertData("test data");
            }
        }


    }

}
