package celestialwizardry.proxy;

import celestialwizardry.client.ItemRendererSpellBook;
import celestialwizardry.client.render.RenderBell;
import celestialwizardry.client.render.RenderEntityBell;
import celestialwizardry.client.render.RenderMagicalStone;
import celestialwizardry.client.render.RenderOBJBlock;
import celestialwizardry.client.render.RenderWritingTable;
import celestialwizardry.client.settings.KeyBindings;
import celestialwizardry.entity.EntityBell;
import celestialwizardry.init.ModItems;
import celestialwizardry.reference.EventHandlers;
import celestialwizardry.reference.Settings;
import celestialwizardry.tileentity.TileEntityBell;
import celestialwizardry.tileentity.TileEntityWritingTable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy
{
    @Override
    public void registerEventHandlers()
    {
        super.registerEventHandlers();

        // Register client tick handler
        FMLCommonHandler.instance().bus().register(EventHandlers.CLIENT_TICK_EVENT_HANDLER);

        // Register key input handler
        FMLCommonHandler.instance().bus().register(EventHandlers.KEY_INPUT_EVENT_HANDLER);
        
        // Register client render tick handler
        FMLCommonHandler.instance().bus().register(EventHandlers.CLIENT_RENDER_TICK_EVENT_HANDLER);
    }

    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(KeyBindings.cast);
        ClientRegistry.registerKeyBinding(KeyBindings.change);
    }

    @Override
    public void registerRenderer()
    {
        if (Settings.spellBook3dModel)
        {
            MinecraftForgeClient.registerItemRenderer(ModItems.spellBook, new ItemRendererSpellBook());
        }

        RenderingRegistry.registerBlockHandler(new RenderOBJBlock());
        RenderingRegistry.registerBlockHandler(new RenderMagicalStone());
        
        RenderingRegistry.registerEntityRenderingHandler(EntityBell.class, new RenderEntityBell());
//        RenderingRegistry.registerEntityRenderingHandler(EntityLivingOre.class, new RenderOreGolem());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWritingTable.class, new RenderWritingTable());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBell.class, new RenderBell());
    }

}
