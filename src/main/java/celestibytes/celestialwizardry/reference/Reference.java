package celestibytes.celestialwizardry.reference;

/**
 * This class contains common mod related constants that are used often.
 * <p/>
 * Basically, if you want to use mod id for example, you should always refer to constant in this class.
 */
public class Reference
{
    public static final String MOD_ID = "celestialwizardry";
    public static final String MOD_NAME = "Celestial Wizardry";
    public static final String MOD_VERSION = Version.VERSION;

    public static final String SERVER_PROXY_CLASS = "celestibytes.celestialwizardry.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "celestibytes.celestialwizardry.proxy.ClientProxy";

    public static final String GUI_FACTORY_CLASS = "celestibytes.celestialwizardry.config.gui.CWGuiFactory";

    public static final String FINGERPRINT = "@FINGERPRINT@";

    public static final String DEPENDENCIES = "required-after:celesticore@[" + celestibytes.core.reference.Version.VERSION + ",);after:Baubles";

    public static final String BAUBLES_ROOT = "https://dl.dropboxusercontent.com/u/47135879/";
    public static final String BAUBLES_ID = "Baubles";
    public static final String BAUBLES_IFACE = "IBauble";
}
