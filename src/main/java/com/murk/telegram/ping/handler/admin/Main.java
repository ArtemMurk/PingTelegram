package com.murk.telegram.ping.handler.admin;

import com.murk.telegram.ping.handler.admin.connect.TelegramPingBot;
import com.murk.telegram.ping.handler.admin.service.PingServiceImpl;
import com.murk.telegram.ping.handler.admin.utils.DialogServiceCache;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main
{
    public static void main(String[] args) {
        String username = args[0];
        String token = args[1];
        String secretKey = args[2];


        openTelegramConnection(username,token,secretKey);
    }

    private static void openTelegramConnection(String username, String token, String secretKey) {
        TelegramPingBot erhereumBot= null;
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(erhereumBot = new TelegramPingBot (username,token,secretKey, PingServiceImpl.INSTANCE, DialogServiceCache.INSTANCE));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
