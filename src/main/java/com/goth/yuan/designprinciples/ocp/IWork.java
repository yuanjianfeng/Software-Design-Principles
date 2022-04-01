package com.goth.yuan.designprinciples.ocp;

/**
 * 开闭原则，对外提供方法和函数
 * @author Yuanjianfeng
 * @version 1.0
 * @date 2022/3/31
 */
public interface IWork {

    /**
     * 人员
     * @return
     */
    Integer getType();

    /**
     * 获取上班方式
     * @return
     */
    String getGoWork();

    /**
     * 获取上班打卡时间
     * @return
     */
    String getStartWorkTime();

    /**
     * 获取工作时长
     * @return
     */
    String getWorkTime();

}
