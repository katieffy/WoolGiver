package com.bukkit.wesnc.WoolGiver;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * WoolGiver for Bukkit
 *
 * @author Wesnc
 */
public class WoolGiver extends JavaPlugin {
    private final HashMap<Player, Boolean> debugees = new HashMap<Player, Boolean>();
    Logger logger = Logger.getLogger("Minecraft");
   

    public void onEnable() {
        // TODO: Place any custom enable code here including the registration of any events

        // Register our events
        //PluginManager pm = getServer().getPluginManager();
        // EXAMPLE: Custom code, here we just output some info so we can check all is well
        PluginDescriptionFile pdfFile = this.getDescription();
        System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
        logger.log(Level.INFO, "[WoolGiver] loaded");
    }
    public void onDisable() {
        // TODO: Place any custom disable code here

        // NOTE: All registered events are automatically unregistered when a plugin is disabled

        // EXAMPLE: Custom code, here we just output some info so we can check all is well
        System.out.println("Goodbye world!");
        logger.log(Level.INFO, "[WoolGiver] Unloaded");
    }
    
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
    	//Player object
    	Player player = (Player) sender;
    	
    	if(cmd.getName().equalsIgnoreCase("wool"))
    	{
    		//String args, in this case its the first argument /wool args
    		
    		
    		if(args[0].equalsIgnoreCase(".give"))
    		{
    			String color = args[1];
	    		if(color.equalsIgnoreCase("orange"))
	    		{
	    			//getting the players inv, and adding the wool item.
	    			//item number/id - stackamount/item count to spawn with - short damage(selfexplainatory) - byte WOOLCOLOR
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 1));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("magenta"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 2));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("lightblue"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 3));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("yellow"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 4));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("limegreen"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 5));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("pink"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 6));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("gray"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 7));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("lightgray"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 8));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("cyan"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 9));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("purple"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 10));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("blue"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 11));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("brown"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 12));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("green"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 13));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("red"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 14));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("black"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 15));
	    			return true;
	    		}
	    		
	    		if(color.equalsIgnoreCase("white"))
	    		{
	    			player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 0));
	    			return true;
	    		}
    		}
    		
    		//give all command
    		if(args[0].equalsIgnoreCase(".giveall"))
    		{
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 1));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 2));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 3));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 4));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 5));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 6));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 7));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 8));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 9));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 10));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 11));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 13));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 14));
	    		player.getInventory().addItem(new ItemStack(35, 64, (short) 0, (byte) 15));
	    		return true;
    		}
    		
    		//help command
    		if(args[0].equalsIgnoreCase(".help"))
    		{
    			player.sendMessage(ChatColor.GREEN+"[WoolGiver]"+ChatColor.DARK_GRAY+"Commands - /wool .help (shows this), /wool .giveall (gives all wool types), /wool .give COLOR");
    			player.sendMessage(ChatColor.GREEN+"[WoolGiver]"+ChatColor.DARK_GRAY+"Wool Colors - white, orange, magenta, lightblue, yellow, limegreen, pink, gray, lightgray, cyan, purple, blue, brown, green, red, black");
    			return true;
    		}
    		
    		//remove all wool from player's inv
    		if(args[0].equalsIgnoreCase(".removeinv"))
    		{
    			player.getInventory().remove(Material.WOOL);
    			return true;
    		}
    		
    		
    	}
    	else
    	{
    		return false;
    	}
		return false;
    }
    
    public boolean isDebugging(final Player player) {
        if (debugees.containsKey(player)) {
            return debugees.get(player);
        } else {
            return false;
        }
    }

    public void setDebugging(final Player player, final boolean value) {
        debugees.put(player, value);
    }
}

