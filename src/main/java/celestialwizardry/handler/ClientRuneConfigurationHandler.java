package celestialwizardry.handler;

import celestialwizardry.config.RuneConfig;
import celestialwizardry.network.message.MessageRuneConfig;
import celestialwizardry.registry.RuneRegistry;
import celestialwizardry.util.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;


@SideOnly(Side.CLIENT)
public class ClientRuneConfigurationHandler
{
    private static List<String> runeConfBuffer = null;
    private static RuneConfig runeConfigFromServer = null;

    private static boolean configSetup = false;

    public static void setupRuneConfig(RuneConfig rc)
    {
        RuneRegistry.setupNumIds(rc);
    }

    public static void addEntriesToBuffer(MessageRuneConfig msg)
    {
        if (runeConfBuffer == null)
        {
            runeConfBuffer = new ArrayList<String>();
        }
        System.out.println(msg.entryLines.length);
        for (int i = 0; i < msg.entryLines.length; i++)
        {
            runeConfBuffer.add(msg.entryLines[i]);
        }
        if (runeConfBuffer.size() == msg.fullEntryCount && !configSetup)
        {
            LogHelper.info("Building RuneConfig on CLIENT from " + runeConfBuffer.size() + "/" + msg.fullEntryCount
                                   + " entries.");
            buildRuneConfig();
            RuneRegistry.setupNumIds(runeConfigFromServer);
            configSetup = true;
            runeConfBuffer.clear();
        }
    }

    private static void buildRuneConfig()
    {
        runeConfigFromServer = RuneConfig.buildConfigFromStringArray(objArrayAsStringArray(runeConfBuffer.toArray()));
    }

    private static String[] objArrayAsStringArray(Object[] a)
    {
        String[] ret = new String[a.length];
        for (int i = 0; i < ret.length; i++)
        {
            if (a[i] != null)
            {
                ret[i] = a[i].toString();
            }
        }
        return ret;
    }

    public static void reset()
    { // TODO
        runeConfBuffer.clear();
        configSetup = false;
    }

}
