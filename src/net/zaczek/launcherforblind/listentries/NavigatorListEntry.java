package net.zaczek.launcherforblind.listentries;


public class NavigatorListEntry extends AbstractListEntry {

	@SuppressWarnings("rawtypes")
	public NavigatorListEntry(String label, Class activityClass) {
		super(label);
	}

	@Override
	public void onSelected() {
		
	}

	@Override
	public String getTextToSay() {
		return null;
	}
}