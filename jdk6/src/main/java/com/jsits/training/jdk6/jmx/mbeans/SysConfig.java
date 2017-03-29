package com.jsits.training.jdk6.jmx.mbeans;

import javax.management.MXBean;

/**
 * @author chenhu
 *  System configuration
 */
@MXBean
public interface SysConfig {
    
    public String getServerId();

    public void setServerId(String id);

    public void printServerId();
}
