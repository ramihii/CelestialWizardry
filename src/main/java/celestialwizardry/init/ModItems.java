package celestialwizardry.init;

import celestialwizardry.item.ItemCW;
import celestialwizardry.item.ItemMagicalInk;
import celestialwizardry.item.ItemScroll;
import celestialwizardry.item.ItemSpellScroll;
import celestialwizardry.item.ItemStaff;
import celestialwizardry.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Just a class containing all mod items
 */
public class ModItems
{
    public static final ItemCW magicalInk = new ItemMagicalInk();
    public static final ItemCW staff = new ItemStaff();
    public static final ItemCW scroll = new ItemScroll();
    public static final ItemCW spellScroll = new ItemSpellScroll();

    public static void init()
    {
        GameRegistry.registerItem(magicalInk, "item." + Names.Items.MAGICAL_INK);
        GameRegistry.registerItem(staff, "item." + Names.Items.STAFF);
        GameRegistry.registerItem(scroll, "item." + Names.Items.SCROLL);
        GameRegistry.registerItem(spellScroll, "item." + Names.Items.SPELL_SCROLL);
    }
}
