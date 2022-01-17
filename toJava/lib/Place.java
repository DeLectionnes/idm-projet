package lib;

import java.util.ArrayList;

public class Place{
	
	private String name;

	private String description;
	private PlaceType type;
	private ArrayList<String> paths;
	private String placeItemCondition = "default";
	private ArrayList<String> items = new ArrayList<String>();
	private ArrayList<String> knowledges = new ArrayList<String>();
	private ArrayList<String> npcs = new ArrayList<String>();


	public Place(String n, String d, PlaceType t){
		this.setName(n);
		this.setDescription(d);
		this.setType(t);
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

	public String getPlaceItemCondition() {
		return placeItemCondition;
	}

	public void setPlaceItemCondition(String placeItemCondition) {
		this.placeItemCondition = placeItemCondition;
	}

	public ArrayList<String> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<String> paths) {
		this.paths = paths;
	}

	public void addPath(String p) {
		this.paths.add(p);
	}

	public ArrayList<String> getItems() {
		return items;
	}
	
	public void setItems(ArrayList<String> items) {
		this.items = items;
	}

	public void addItem(String i) {
		this.items.add(i);
	}

	public ArrayList<String> getNpcs() {
		return npcs;
	}

	public void setNpcs(ArrayList<String> npcs) {
		this.npcs = npcs;
	}

	public void addNpc(String n) {
		this.npcs.add(n);
	}

	public ArrayList<String> getKnowledges() {
		return knowledges;
	}

	public void setKnowledges(ArrayList<String> knowledges) {
		this.knowledges = knowledges;
	}

	public void addKnowledge(String k) {
		this.knowledges.add(k);
	}

	public PlaceType getType() {
		return type;
	}

	public void setType(PlaceType type) {
		this.type = type;
	}
}