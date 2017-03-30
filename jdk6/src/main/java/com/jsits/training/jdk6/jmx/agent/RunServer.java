package com.jsits.training.jdk6.jmx.agent;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jsits.training.jdk6.jmx.mbeans.SysConfigMBean;
import com.jsits.training.jdk6.jmx.mbeans.NotificationSysConfig;
import com.jsits.training.jdk6.jmx.mbeans.NotificationSysConfigMBean;
import com.jsits.training.jdk6.jmx.mbeans.SysConfig;

public class RunServer {
    
    private static final Logger log = LoggerFactory.getLogger(RunServer.class.getName());

    public static void main(String... strings) throws Exception {
        RunServer.mainNotificationMBean();
    }
    
    /**
     * MBean example
     * @param strings
     * @throws Exception
     */
    public static void mainMBean() throws Exception {
        MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.jsits.training.mbeans:type=SysConfig");
        SysConfigMBean configBean = new SysConfig();
        mbeanServer.registerMBean(configBean, name);
        log.debug("Waiting forever ... ...");
        Thread.sleep(Long.MAX_VALUE);
    }
    
    /**
     * MBean example
     * @param strings
     * @throws Exception
     */
    public static void mainNotificationMBean() throws Exception {
        MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.jsits.training.mbeans:type=SysConfig");
        NotificationSysConfigMBean configBean = new NotificationSysConfig();
        mbeanServer.registerMBean(configBean, name);
        log.debug("Waiting forever ... ...");
        Thread.sleep(Long.MAX_VALUE);
    }
    /**
     * MXBean example
     * @param strings
     * @throws Exception
     */
    public static void mainMXBean() throws Exception {
        MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.jsits.training.mbeans:type=SysConfig");
        SysConfigMBean configBean = new SysConfig();
        mbeanServer.registerMBean(configBean, name);
        log.debug("Waiting forever ... ...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
