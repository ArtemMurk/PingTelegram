# Telegram Ping Administrator

## Project Information
This alarm and administration module for ping handler. 
It use Telegram for administrate projects configuration, and send notification to you if something went wrong. 

**WARN -> You need Ping handler system that catch pings, download and run this module [PingHandler](https://github.com/ArtemMurk/PingHandlerCore)**

## Build 
Use Maven for build this project. 
This project package in **jar** file, you need Java jre 8.0 to run it.

Build command.
> mvn clean package

## Run
To run this project you need your own telegram Bot, it's very simple to create it. 
[BotFather](https://telegram.me/BotFather) help you, follow instruction.
Also you need to make up your secret key for new user initial conversation with bot.

Command to run.
> java -jar TelegramAdminPing-1.0.jar \<BotUsername> \<BotToken> \<YourSecretKey>


## Dialog scheme
![dialog scheme](https://github.com/ArtemMurk/PingTelegram/blob/master/TeLegramDialogPing.png)

## Dialog scheme
![db scheme](https://github.com/ArtemMurk/PingTelegram/blob/master/DBScheme.png)

## Contact Information
If you have any questions I'd be happy to answer it.
 
* **Author**: Артём Муравлёв
* **Linkeidn**: [My Linkeidn](https://linkedin.com/in/artem-muravlov)
* **Telegram**: @artem_murk
* **Mail**: muravlevars@gmail.com