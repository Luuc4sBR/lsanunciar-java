package me.luuc4s.br;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main main;
	
	@Override
	public void onEnable() {
		main = this;
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin habilitado com sucesso.");
		getCommand("anunciar").setExecutor(new AnnounceCommand());
		saveDefaultConfig();
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Plugin desabiliado com sucesso.");
	}}
