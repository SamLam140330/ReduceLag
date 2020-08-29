package com.samlam140330.reducelag.commands;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;

public class UnloadDimensions extends CommandBase
{
	@Override
	public String getName()
	{
		return "unloaddimensions";
	}

	@Override
	public String getUsage(ICommandSender sender)
	{
		return "commands.reducelag.unloaddimensions.usage";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		if (args.length == 0)
		{
			throw new WrongUsageException(getUsage(sender));
		}
		else if (args.length == 1)
        {
        	if (args[0].equals("all"))
        	{
        		sender.sendMessage(new TextComponentTranslation("commands.reducelag.unloaddimensions.all"));
            }
        	else if (args[0].equals("config"))
        	{
        		sender.sendMessage(new TextComponentTranslation("commands.reducelag.unloaddimensions.config"));
        	}
            else
            {
                throw new CommandException("commands.generic.syntax");
            }
        }
		else if (args.length > 1)
		{
			throw new CommandException("commands.generic.syntax");
		}
	}

	@Override
	public int getRequiredPermissionLevel()
	{
		return 2;
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos)
	{
		if (args.length == 1)
		{
			return getListOfStringsMatchingLastWord(args, Arrays.asList("config", "all"));
		}
		return Collections.emptyList();
	}
}
