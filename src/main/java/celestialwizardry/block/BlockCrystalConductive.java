package celestialwizardry.block;

import celestialwizardry.api.crystal.ICrystal;
import celestialwizardry.api.energy.EnergyMagic;
import celestialwizardry.api.energy.EnergyType;
import celestialwizardry.reference.Names;
import celestialwizardry.registry.EnergyRegistry;
import celestialwizardry.tileentity.TileEntityCrystal;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO I AM JUST A SMALL LITTLE PURPLE CRYSTAL WHO NEEDS MODEL ;) PROBABLY SOMETHING LIKE THAUMCRAFT CRYSTALS
 */
public class BlockCrystalConductive extends BlockCrystal
{
    public BlockCrystalConductive()
    {
        super();
        this.setBlockName(Names.Blocks.CRYSTAL_CONDUCTIVE);
    }

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
        return new TileEntityCrystal(this);
    }

    /* ======================================== ITileEntityProvider END ===================================== */

    /* ======================================== ICrystal START ===================================== */

    /**
     * Get the {@link celestialwizardry.api.energy.EnergyType}s this {@link ICrystal} can handle.
     *
     * @param world the {@link net.minecraft.world.World} this {@link ICrystal} is
     *
     * @return A list of {@link celestialwizardry.api.energy.EnergyType} this {@link ICrystal} can handle
     */
    @Override
    public List<EnergyType> acceptableEnergies(World world)
    {
        List<EnergyType> list = new ArrayList<EnergyType>();

        for (EnergyType energyType : EnergyRegistry.energyMap.values())
        {
            list.add(energyType); // aka every energy type
        }

        return list;
    }

    /**
     * Can this {@link celestialwizardry.api.crystal.ICrystal} be bounded to given {@link celestialwizardry.api.crystal.ICrystal}.
     *
     * @param world   the {@link net.minecraft.world.World} this {@link celestialwizardry.api.crystal.ICrystal} is
     * @param crystal the {@link celestialwizardry.api.crystal.ICrystal} this {@link celestialwizardry.api.crystal
          * .ICrystal} is going to be bounded with
     *
     * @return can this {@link celestialwizardry.api.crystal.ICrystal} to the {@link celestialwizardry.api.crystal
          * .ICrystal}
     */
    @Override
    public boolean canBoundTo(World world, ICrystal crystal)
    {
        return true;
    }

    /**
     * The {@link net.minecraft.block.Block} instance that implements {@link ICrystal}.
     *
     * @return the {@link net.minecraft.block.Block}
     */
    @Override
    public Block getBlock()
    {
        return this;
    }

    /* ======================================== ICrystal END ===================================== */

    /* ======================================== Block START ===================================== */

    /* @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return RenderOBJBlock.ID;
    } */

    /* ======================================== Block END ===================================== */
}
