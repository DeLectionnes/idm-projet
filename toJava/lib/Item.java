package lib;
import java.util.ArrayList;

public class Item{
	
	private String name;
	private String description;
	private Integer size;
	private String visibleCondition = "default";
	private ArrayList<String> transformabilityConditions = new ArrayList<String>();

	public Item(String n, String d, Integer s){
		this.setName(n);
		this.setDescription(d);
		this.setSize(s);
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
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getVisibleCondition() {
		return visibleCondition;
	}
	public void setVisibleCondition(String visibleCondition) {
		this.visibleCondition = visibleCondition;
	}
	public ArrayList<String> getTransformabilityConditions() {
		return transformabilityConditions;
	}
	public void setTransformabilityConditions(ArrayList<String> transformabilityCondition) {
		this.transformabilityConditions = transformabilityCondition;
	}
	public void addTransformabilityCondition(String transformabilityCondition) {
		this.transformabilityConditions.add(transformabilityCondition);
	}
}