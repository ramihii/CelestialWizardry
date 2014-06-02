package celestialwizardry.api.spellgrammar;

import java.util.List;

public class RuneAction extends RuneCategory
{
	//SPAWN, TELEPORT, ACCELERATE
	private String actionString;
	
	public RuneAction(float complexity, String actionString) {
		super(complexity);
	}

	@Override
	public List validRuneAttributeTypes() {
		return null;
	}
	
	@Override
	public String getCategoryIDString() {
		return "action";
	}
   
}
