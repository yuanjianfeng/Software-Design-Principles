package com.goth.yuan.designprinciples.ocp;

import lombok.Setter;

/**
 * 代码工作
 * @author Yuanjianfeng
 * @version 1.0
 * @date 2022/4/1
 */
@Setter
public class CodeWork implements IWork{

    Integer type = 1;

    String goWork = "开车";

    String startWorkTime = "9点半开始工作";

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
        return this.startWorkTime;
    }

    @Override
    public String getWorkTime() {
        return this.workTime;
    }
}
