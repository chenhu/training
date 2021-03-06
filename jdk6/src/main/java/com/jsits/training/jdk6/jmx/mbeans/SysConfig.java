package com.jsits.training.jdk6.jmx.mbeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SysConfig implements SysConfigMBean {

    private String serverId = "1";

    private static final Logger log = LoggerFactory.getLogger(SysConfig.class.getName());

    @Override
    public String getServerId() {
        return this.serverId;
    }

    @Override
    public void setServerId(String id) {
        this.serverId = id;

    }

    @Override
    public void printServerId() {
        log.debug("the server id is : {}", serverId);
    }

}
