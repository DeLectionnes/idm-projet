package lib;

public class Knowledge{
	
	private String name;
	private String description;
	private String visibleCondition = "default";

	public Knowledge(String n, String d){
		this.setName(n);
		this.setDescription(d);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVisibleCondition() {
		return visibleCondition;
	}
	public void setVisibleCondition(String visibleCondition) {
		this.visibleCondition = visibleCondition;
	}
}

