package com.sensetime.springschedule.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestSchedule {

    //单位为毫秒
    @Scheduled(fixedRate = 3000)
    public void intervalScheduler() {

        System.out.println("interval scheduer");
    }

    //第一位代表的是秒
    @Scheduled(cron = "0 */1 * * * *")
    public void cronScheduler() {

        System.out.println("cron scheduler");
    }
}
