package com.murk.telegram.ping.handler.admin.connect;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramPingBot extends TelegramLongPollingBot {
    private String userName;
    private String token;
    private String secretKey;

    public TelegramPingBot(String userName, String token, String secretKey) {
        this.userName = userName;
        this.token = token;
        this.secretKey = secretKey;
    }

    public void onUpdateReceived(Update update) {

    }

    public String getBotUsername() {
        return userName;
    }

    public String getBotToken() {
        return token;
    }
}
