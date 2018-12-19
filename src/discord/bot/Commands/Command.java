package discord.bot.Commands;

import discord.bot.main.Constants;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public abstract class Command extends ListenerAdapter {
    private String commandName;
    private String fullCommand;

    public Command(String name){
        this.commandName = name;
        this.fullCommand = Constants.PREFIX + name;
    }

    public boolean isValidCommand(String input){

        if(this.getFullCommand().equalsIgnoreCase(input)){
            return true;
        }
        return false;
    }

    public String getName(){
        return this.getName();
    }

    public String getFullCommand(){
        return this.fullCommand;
    }

    public abstract void onMessageReceived(MessageReceivedEvent event);
}
