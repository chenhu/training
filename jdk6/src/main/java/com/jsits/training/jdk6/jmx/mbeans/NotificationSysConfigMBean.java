package com.jsits.training.jdk6.jmx.mbeans;

/**
 * @author chenhu
 *  System configuration
 */
public interface NotificationSysConfigMBean {
    
    public String getServerId();

    public void setServerId(String id);

    public void printServerId();
}
