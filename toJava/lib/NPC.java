package lib;

import java.util.ArrayList;

public class NPC{
	private String name;
	private String obligatoryCondition = "default";
	private ArrayList<String> initialChoices = new ArrayList<String>();
	private String visibleCondition = "default";
	
	public NPC(String n){
		this.name = n;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getObligatoryCondition() {
		return obligatoryCondition;
	}


	public void setObligatoryCondition(String obligatoryCondition) {
		this.obligatoryCondition = obligatoryCondition;
	}


	public String getVisibleCondition() {
		return visibleCondition;
	}


	public void setVisibleCondition(String visibleCondition) {
		this.visibleCondition = visibleCondition;
	}


	public ArrayList<String> getInitialChoices() {
		return initialChoices;
	}


	public void setInitialChoices(ArrayList<String> initialChoices) {
		this.initialChoices = initialChoices;
	}

	public void addInitialChoice(String initialChoice) {
		this.initialChoices.add(initialChoice);
	}

	
}