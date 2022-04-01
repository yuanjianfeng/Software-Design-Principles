package com.goth.yuan.designprinciples.ocp;

import lombok.Data;

/**
 * 开闭原则举例
 * @author Yuanjianfeng
 * @version 1.0
 * @date 2022/4/1
 */
@Data
public class Worker {


    /**
     * 不符合开闭原则的代码,对扩展开放，对修改关闭
     * 当需要新增一个类型的员工的时候getWorker这个方法需要被修改才能满足软件的需求。
     * 此处为了演示，return的work都去实现了IWork，开笔原则需要将一些基础类抽象
     */
    public static String getWorkerWay(Integer type){
       if(1 == type) {
           return new CodeWork().getGoWork();
       }else if(2==type){
           return new TestWork().getGoWork();
       }
        return "没有该类型员工";
    }

    /**
     * 开闭原则代码，将参数抽象化，想得到具体员工
     * @return
     */
    public static String getWorkerWay(IWork worker){
        return worker.getGoWork();
    }
}
