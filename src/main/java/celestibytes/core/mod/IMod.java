package celestibytes.core.mod;

import celestibytes.core.mod.version.Channel;

public interface IMod
{
    public String getId();

    public String getName();

    public String getTargetLog();

    public String getVersion();

    public String getMinecraftVersion();

    public boolean allowVersionCheck();

    public boolean allowVersionNote();

    public void setRegistered(boolean registered);

    public boolean isRegistered();

    public Channel getChannel();

    public Channel getUpdateChannel();
}
