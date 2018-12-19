package discord.bot.Commands.game_commands;

import discord.bot.Commands.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Roll extends Command {

    public Roll(String name){
        super(name);
    }

    public void onMessageReceived(MessageReceivedEvent event){
        String[] input = event.getMessage().getContentRaw().split( " ");
        int randNum;

        if(super.isValidCommand(input[0]) == true){
            randNum = (int) Math.ceil(Math.random() * 6);

            event.getChannel().sendMessage("Dice roll: " + randNum).queue();
        }
    }
}
