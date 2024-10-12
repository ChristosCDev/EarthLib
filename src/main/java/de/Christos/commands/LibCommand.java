package de.Christos.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class LibCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("earthlib")) {
            sender.sendMessage("This Server is using EarthLib. Made by Christos");
            return true;
        }
        return false;
    }
}
