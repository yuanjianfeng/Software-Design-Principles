package com.goth.yuan.designprinciples.ocp;

import lombok.Setter;

/**
 *
 * 开始闭原则：
 * 1。模块和函数对扩展开放，对修改关闭，抽象类构建框架，实现类实现具体细节
 * 2。当软件变化时候，尽量通过扩展软件实体的行为来实现变化，而不是修改原来已经有的代码来实现变化
 *
 * 测试工作
 * @author Yuanjianfeng
 * @version 1.0
 * @date 2022/4/1
 */
@Setter
public class TestWork implements IWork{
    Integer type = 2;

    String goWork = "公交";

    String startWorkTime = "9点开始工作";

    String workTime = "工作8小时";

    @Override
    public Integer getType() {
        return this.type;
    }

    @Override
    public String getGoWork() {
        return this.goWork;
    }

    @Override
    public String getStartWorkTime() {
        return null;
    }

    @Override
    public String getWorkTime() {
        return null;
    }
}
