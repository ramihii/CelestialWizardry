package celestialwizardry.config;

import celestialwizardry.CelestialWizardry;
import celestialwizardry.reference.Settings;

/**
 * Class used to initialize all mod configuration settings
 */
public class SettingHandler
{
    public static void init()
    {
        /**
         * General
         */
        String category = Settings.Categories.GENERAL;

        Settings.enableSeasonal = CelestialWizardry.config.get(category, "enableSeasonal", true);
        Settings.debugMode = CelestialWizardry.config.get(category, "debugMode", true); // TODO

        /**
         * Spells
         */
        category = Settings.Categories.SPELLS;

        Settings.spellCostMultiplier = (float) CelestialWizardry.config.get(category, "spellCostMultiplier", 1.0f);
    }
}
