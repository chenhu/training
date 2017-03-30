package com.jsits.training.jdk6.jmx.mbeans;

import javax.management.AttributeChangeNotification;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationSysConfig extends NotificationBroadcasterSupport implements NotificationSysConfigMBean {

    private String serverId = "1";
    
    private long sequenceNumber = 1;

    private static final Logger log = LoggerFactory.getLogger(NotificationSysConfig.class.getName());

    @Override
    public String getServerId() {
        return this.serverId;
    }

    @Override
    public void setServerId(String id) {
        
        String oldServerId = this.getServerId();
        this.serverId = id;
        log.debug("old Server Id is:{}", oldServerId);
        log.debug("New Server Id is:{}", id);
        Notification n = new AttributeChangeNotification(this, sequenceNumber++, System.currentTimeMillis(), " Server Id Changes! ", "ServerId", "String", oldServerId, id);
        super.sendNotification(n);
    }

    @Override
    public void printServerId() {
        log.debug("the server id is : {}", serverId);
    }
    
    @Override 
    public MBeanNotificationInfo[] getNotificationInfo() { 
        String[] types = new String[] { 
            AttributeChangeNotification.ATTRIBUTE_CHANGE 
        }; 
        String name = AttributeChangeNotification.class.getName(); 
        String description = "An attribute of this MBean has changed"; 
        MBeanNotificationInfo info = new MBeanNotificationInfo(types, name, description); 
        return new MBeanNotificationInfo[] {info}; 
    } 

}
