package celestialwizardry.init;

import celestialwizardry.api.spellgrammar.Rune;
import celestialwizardry.api.spellgrammar.RuneAction;
import celestialwizardry.api.spellgrammar.RuneEntity;
import celestialwizardry.registry.RuneRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class InitRunes {
	
//	public static final Rune runeAction = new RuneAction();
//	public static final Rune runeActionTeleport = new RuneAction();
	
	//Entities
	public static final Rune runeEntityPig = new RuneEntity(1f, "pig");
	public static final Rune runeEntityCow = new RuneEntity(1f, "cow");
	public static final Rune runeEntityChicken = new RuneEntity(1f, "chicken");
	public static final Rune runeEntityBat = new RuneEntity(1f, "bat");
	public static final Rune runeEntityOcelot = new RuneEntity(1f, "ocelot");
	public static final Rune runeEntityWolf = new RuneEntity(1f, "wolf");
	public static final Rune runeEntityMooshroom = new RuneEntity(1f, "mooshroom");
	public static final Rune runeEntityVillager = new RuneEntity(1f, "villager");
	public static final Rune runeEntityHorse = new RuneEntity(1f, "horse");
	
	public static final Rune runeEntityZombie = new RuneEntity(1f, "zombie");
	public static final Rune runeEntitySkeleton = new RuneEntity(1f, "skeleton");
	public static final Rune runeEntityCreeper = new RuneEntity(1f, "creeper");
	public static final Rune runeEntityGhast = new RuneEntity(1f, "ghast");
	public static final Rune runeEntityEnderman = new RuneEntity(1f, "enderman");
	public static final Rune runeEntitySlime = new RuneEntity(1f, "slime");
	public static final Rune runeEntityMagmacube = new RuneEntity(1f, "magmacube");
	public static final Rune runeEntityBlaze = new RuneEntity(1f, "blaze");
	public static final Rune runeEntitySilverfish = new RuneEntity(1f, "silverfish");
	public static final Rune runeEntitySpider = new RuneEntity(1f, "spider");
	public static final Rune runeEntityCaveSpider = new RuneEntity(1f, "cavespider");
	public static final Rune runeEntityPigZombie = new RuneEntity(1f, "pigzombie");
	
	@SideOnly(Side.SERVER)
	public void serverInitRunes() {
//		RuneRegistry.
	}
	
	@SideOnly(Side.CLIENT)
	public void clientInitRunes(/*RuneConfig rc*/) {
		
	}
}
