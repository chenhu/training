package com.jsits.training.jdk6.jmx.agent;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jsits.training.jdk6.jmx.mbeans.SysConfig;
import com.jsits.training.jdk6.jmx.mbeans.TransportaionSysconfig;

public class RunServer {
    
    private static final Logger log = LoggerFactory.getLogger(RunServer.class.getName());

    public static void main(String... strings) throws Exception {
        MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.jsits.training.mbeans:type=SysConfig");
        SysConfig configBean = new TransportaionSysconfig();
        mbeanServer.registerMBean(configBean, name);
        log.debug("Waiting forever ... ...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
