package discord.bot.main;

import discord.bot.Commands.game_commands.Roll;
import discord.bot.events.HelloBot;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import javax.security.auth.login.LoginException;

public class Main {
    private static JDA jda;

    public static void main(String[] args) throws LoginException {
	    jda = new JDABuilder(AccountType.BOT).setToken(Constants.TOKEN).build();

	    jda.addEventListener(new HelloBot());
	    jda.addEventListener(new Roll("roll"));
    }
}
