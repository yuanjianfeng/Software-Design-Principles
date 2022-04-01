package com.goth.yuan.designprinciples.ocp;

import lombok.Setter;

/**
 * 开闭原则总结使用
 * @author Yuanjianfeng
 * @version 1.0
 * @date 2022/4/1
 */
public class OcpSummary {


    public static void main(String[] args) {

        /**
         * 非开闭原则
         * 1.我想得到不同打工人上班的方式
         * 2.新增员工可能要去修改getWorkerWay(Integer type)方法中的逻辑
         */
        String worker = Worker.getWorkerWay(1);
        System.out.println(worker);


        System.out.println("----------------------增加经理类----------------------------");
        /**
         * 假如需要获取项目经理的上班方式
         */
        String work1 = Worker.getWorkerWay(0);
        System.out.println(work1);


        //开闭原则的方法块
        String work2 = Worker.getWorkerWay(new ManageWork());
        System.out.println("不要修改Worker输出上班方式:"+work2);
    }



}
