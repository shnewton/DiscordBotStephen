package discord.bot.events;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class HelloBot extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        String[] input = event.getMessage().getContentRaw().split( " ");

        if(input[0].equalsIgnoreCase("Hello")){
            if(!event.getMember().getUser().isBot()){
                event.getChannel().sendMessage("Sup fucker!").queue();
            }
        }
    }
}
