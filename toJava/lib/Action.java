package lib;
import java.util.ArrayList;

public class Action {

    private String name;
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<String> knowledges = new ArrayList<String>();
    private ArrayList<String> itemsConsumed = new ArrayList<String>();

    public Action(String name){
        this.name = name;
    }


    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}
