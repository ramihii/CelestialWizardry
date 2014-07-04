package celestialwizardry.crystal.proxy;

import celestialwizardry.crystal.reference.CrystalNames;
import celestialwizardry.crystal.tileentity.TileEntityCrystalNetworkConductive;

import cpw.mods.fml.common.registry.GameRegistry;

public abstract class CommonCrystalProxy implements ICrystalProxy
{
    @Override
    public void registerEventHandlers()
    {
        // Register world event handler
        // TODO FMLCommonHandler.instance().bus().register(CrystalEventHandlers.Common.CRYSTAL_WORLD_EVENT_HANDLER);
    }

    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityCrystalNetworkConductive.class,
                                        "tile." + CrystalNames.Blocks.CRYSTAL_CONDUCTIVE);
    }
}
