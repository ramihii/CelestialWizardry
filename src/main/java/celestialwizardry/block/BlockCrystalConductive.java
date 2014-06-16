package celestialwizardry.block;

import celestialwizardry.client.render.crystal.RenderCrystalSimple;
import celestialwizardry.init.ModBlocks;
import celestialwizardry.reference.Names;
import celestialwizardry.tileentity.TileEntityCrystalConductive;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockCrystalConductive extends BlockCrystal
{
    public BlockCrystalConductive()
    {
        super();
        this.setBlockName(Names.Blocks.CRYSTAL_CONDUCTIVE);
    }

    /* ======================================== Block START ===================================== */

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        super.randomDisplayTick(world, x, y, z, random);
    }

    /* ======================================== Block END ===================================== */

    /* ======================================== ITileEntityProvider START ===================================== */

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     *
     * @param world
     * @param var2
     */
    @Override
    public TileEntity createNewTileEntity(World world, int var2)
    {
        return new TileEntityCrystalConductive(this);
    }

    /* ======================================== ITileEntityProvider END ===================================== */
}
