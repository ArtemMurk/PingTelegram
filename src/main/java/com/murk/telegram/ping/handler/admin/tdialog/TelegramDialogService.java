package com.murk.telegram.ping.handler.admin.tdialog;

import org.telegram.telegrambots.meta.api.methods.PartialBotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

public interface TelegramDialogService {
    PartialBotApiMethod process(Update update);
}
