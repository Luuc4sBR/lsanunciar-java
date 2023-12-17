package me.luuc4s.br;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AnnounceCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player p = (Player) sender;
		
		if (p.hasPermission("anunciar.usar")) {
			if (cmd.getName().equalsIgnoreCase("anunciar")) {
				if (sender instanceof Player) {
					if (args.length > 0) {
					String message = String.join(" ", args).replace("&", "§");	
					Bukkit.broadcastMessage((Main.main.getConfig().getString("Chat.Formato-mensagem").replace("&", "§").replace("%player%", p.getName())).replace("%mensagem%", message));
				} else {
					sender.sendMessage(ChatColor.GREEN + "Utilize: '/anunciar <mensagem>' para estar anunciando alguma mensagem.");
				}} else {
				sender.sendMessage(ChatColor.RED + "Apenas jogadores podem usar este comando.");
			} return true;
		}} else {
		sender.sendMessage(ChatColor.RED + "Você não tem permissão para utilizar este comando.");
		return true;
		}
		return false;
	}}