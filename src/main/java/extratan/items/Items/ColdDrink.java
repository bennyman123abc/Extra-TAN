package extratan.items.Items;

import extratan.core.init.PotionInit;
import extratan.creativetabs.CreativeTabHandler;
import extratan.items.BaseDrinkableItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ColdDrink extends BaseDrinkableItem {

	public ColdDrink() {
		super("coldDrink", "flask_with_cold_water", -4, CreativeTabHandler.ExtraTANDrinks);
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entity)
	{
		EntityPlayer player = (EntityPlayer)entity;
		player.addPotionEffect(new PotionEffect(PotionInit.HEAT_RESISTANCE, 600));
		
		return super.onItemUseFinish(stack, world, entity);
	}
	
}
