package com.murk.telegram.ping.handler.admin.utils;

import com.murk.telegram.ping.handler.admin.tdialog.TelegramDialogService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by win1.
 */
public enum  DialogServiceCache
{
    INSTANCE;

    private  Map<Long, TelegramDialogService> serviceCache = new ConcurrentHashMap<>();


    public  void clean(long userId)
    {
        serviceCache.remove(userId);
    }

    public  void setNext(long userId, TelegramDialogService instance)
    {
        serviceCache.put(userId,instance);
    }

    public  TelegramDialogService get(long userId)
    {
        return serviceCache.getOrDefault(userId,null);
    }

    public  boolean contains(long userId)
    {
        return serviceCache.containsKey(userId);
    }
}
