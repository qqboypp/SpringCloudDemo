package com.liuscoding.springcloud;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By wangzhisong on 2021/2/10
 */
public class JvmTest {
    public static void main(String[] args) {
        long counter = 1;
        List<Object> dataList = new ArrayList<Object>();
        while (true){
            dataList.add(new Object());
            System.out.println("当前创建了第"+(++counter)+"个对象");
        }
    }


}
