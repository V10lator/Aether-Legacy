package com.legacy.aether.events.enchantments;

import net.minecraftforge.fml.common.eventhandler.Event;

import com.legacy.aether.api.enchantments.AetherEnchantment;
import com.legacy.aether.tile_entities.TileEntityEnchanter;

public class AetherEnchantmentEvent extends Event
{

	public AetherEnchantmentEvent()
	{
		
	}

	public static class SetTimeEvent extends AetherEnchantmentEvent
	{
		private TileEntityEnchanter tileEntity;

		private AetherEnchantment enchantment;

		private int original;

		private int newTime;

		public SetTimeEvent(TileEntityEnchanter tileEntity, AetherEnchantment enchantment, int original)
		{
			this.tileEntity = tileEntity;
			this.enchantment = enchantment;
			this.original = original;

			this.setNewTime(original);
		}

		public TileEntityEnchanter getTileEntity()
		{
			return this.tileEntity;
		}

		public AetherEnchantment getEnchantment()
		{
			return this.enchantment;
		}

		public int getOriginal()
		{
			return this.original;
		}

		public int getNewTime()
		{
			return this.newTime;
		}

		public void setNewTime(int newTime)
		{
			this.newTime = newTime;
		}
	}

	public static class EnchantEvent extends AetherEnchantmentEvent
	{
		private TileEntityEnchanter tileEntity;

		private AetherEnchantment enchantent;

		public EnchantEvent(TileEntityEnchanter tileEntity, AetherEnchantment enchantment)
		{
			this.tileEntity = tileEntity;
			this.enchantent = enchantment;
		}

		public TileEntityEnchanter getTileEntity()
		{
			return this.tileEntity;
		}

		public AetherEnchantment getEnchantment()
		{
			return this.enchantent;
		}
	}

}