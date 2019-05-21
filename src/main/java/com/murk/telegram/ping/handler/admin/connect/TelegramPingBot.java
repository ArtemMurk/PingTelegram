package com.murk.telegram.ping.handler.admin.connect;

import com.murk.telegram.ping.handler.admin.service.PingServiceImpl;
import com.murk.telegram.ping.handler.admin.utils.DialogServiceCache;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramPingBot extends TelegramLongPollingBot {
    private String userName;
    private String token;
    private String secretKey;
    private PingServiceImpl pingService;
    private DialogServiceCache dialogCache;

    public TelegramPingBot(String userName, String token, String secretKey, PingServiceImpl pingService, DialogServiceCache dialogCache) {
        this.userName = userName;
        this.token = token;
        this.secretKey = secretKey;
        this.pingService = pingService;
        this.dialogCache = dialogCache;

    }

    public void onUpdateReceived(Update update) {
        if (update.hasMessage())
        {
            Long userId = update.getMessage().getChatId();
            if (userId != null)
            {
                if (pingService.contains(userId))
                {
                    if (dialogCache.contains(userId))
                    {

                    }
                } else
                    {
                        String message = update.getMessage().getText();
                        if (message.trim().equals(secretKey))
                        {

                        }
                    }

                SendMessage helloMessage = new SendMessage();
                helloMessage.setText("hello text");
                helloMessage.setChatId(update.getMessage().getChatId());

                try {
                    execute(helloMessage);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    public String getBotUsername() {
        return userName;
    }

    public String getBotToken() {
        return token;
    }
}
