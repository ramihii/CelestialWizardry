package celestialwizardry.reference;

import celestialwizardry.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Resources
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

    // GUI textures
    public static final String GUI_SHEET_LOCATION = "textures/gui/";

    public static final ResourceLocation GUI_WRITING_TABLE = ResourceLocationHelper.getResourceLocation(
            GUI_SHEET_LOCATION + "writingTable.png");
}
