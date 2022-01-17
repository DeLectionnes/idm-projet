package lib;
import java.util.ArrayList;

public class Explorer {

    private String name;
    public static Integer maxInt;
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<String> knowledges = new ArrayList<String>();

    public Explorer(String name, Integer maxInt) {
        this.name = name;
        this.maxInt = maxInt;
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
    public Boolean haveItem(String item) {
        Boolean ret = false;
		for (String i : items) {
            if(i==item){
                ret = true;
                break;
            }
        }
        return ret;
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

    public Boolean haveKnowledge(String knowledge) {
        Boolean ret = false;
		for (String k : knowledges) {
            if(k==knowledge){
                ret = true;
                break;
            }
        }
        return ret;
	}
}
