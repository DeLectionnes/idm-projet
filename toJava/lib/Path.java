package lib;

import java.util.ArrayList;

public class Path{
	
	private String name;
	private String description;
	private String to;
	private String visibleCondition = "default";
	private String openedCondition = "default";
	private String obligatoryCondition = "default";
	private ArrayList<String> items = new ArrayList<String>();
	private ArrayList<String> knowledges = new ArrayList<String>();
	private ArrayList<String> itemsConsumed = new ArrayList<String>();

	public Path(String n, String d, String to){
		this.setName(n);
		this.setDescription(d);
		this.setTo(to);
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

	public String getOpenedCondition() {
		return openedCondition;
	}

	public void setOpenedCondition(String openedCondition) {
		this.openedCondition = openedCondition;
	}

	public String getObligatoryCondition() {
		return obligatoryCondition;
	}

	public void setObligatoryCondition(String obligatoryCondition) {
		this.obligatoryCondition = obligatoryCondition;
	}


	public ArrayList<String> getItems() {
		return items;
	}

	public void setItems(ArrayList<String> items) {
		this.items = items;
	}
	public void addItem(String item) {
		this.items.add(item);
	}

	public ArrayList<String> getKnowledges() {
		return knowledges;
	}

	public void setKnowledges(ArrayList<String> knowledges) {
		this.knowledges = knowledges;
	}

	public void addKnowledge(String knowledge) {
		this.knowledges.add(knowledge);
	}

	public ArrayList<String> getItemsConsumed() {
		return itemsConsumed;
	}

	public void setItemsConsumed(ArrayList<String> itemsConsumed) {
		this.itemsConsumed = itemsConsumed;
	}
	public void addItemConsumed(String item) {
		this.itemsConsumed.add(item);
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
}