package celestialwizardry.init;

import celestialwizardry.api.energy.EnergyElemental;
import celestialwizardry.api.energy.EnergyHeat;
import celestialwizardry.api.energy.EnergyMagic;
import celestialwizardry.api.energy.EnergyType;
import celestialwizardry.api.energy.UnformedMatter;
import celestialwizardry.registry.EnergyRegistry;

public class ModEnergyTypes {
	
	public static final EnergyType unformedMatter = new UnformedMatter();
	public static final EnergyType heat = new EnergyHeat();
	public static final EnergyType elementalFire = new EnergyElemental(EnergyType.CWEnergyType.ELEMENTAL_FIRE);
	public static final EnergyType elementalWater = new EnergyElemental(EnergyType.CWEnergyType.ELEMENTAL_WATER);
	public static final EnergyType elementalEarth = new EnergyElemental(EnergyType.CWEnergyType.ELEMENTAL_EARTH);
	public static final EnergyType elementalAir = new EnergyElemental(EnergyType.CWEnergyType.ELEMENTAL_AIR);
	public static final EnergyType magicLunar = new EnergyMagic(EnergyType.CWEnergyType.MAGIC_LUNAR);
	public static final EnergyType magicSolar = new EnergyMagic(EnergyType.CWEnergyType.MAGIC_SOLAR);
	
	public static void init() {
		EnergyRegistry.registerEnergyType(unformedMatter); // "Unformed Matter"
		EnergyRegistry.registerEnergyType(heat);           // "Heat"
		EnergyRegistry.registerEnergyType(elementalFire);  // "Elemental Fire"
		EnergyRegistry.registerEnergyType(elementalWater); // "Elemental Water"
		EnergyRegistry.registerEnergyType(elementalEarth); // "Elemental Earth"
		EnergyRegistry.registerEnergyType(elementalAir);   // "Elemental Air"
		EnergyRegistry.registerEnergyType(magicLunar);     // "Magic Lunar"
		EnergyRegistry.registerEnergyType(magicSolar);     // "Magic Solar"
	}
}
