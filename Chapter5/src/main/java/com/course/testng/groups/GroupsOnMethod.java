package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法22222222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法33333333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法44444444");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后运行的方法·········");
    }


}
