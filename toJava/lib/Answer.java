package lib;
import java.util.ArrayList;

public class Answer {

    private String name;
    private String action;
    private String condition = new Condition();
    private ArrayList<String> nextChoices = new ArrayList<String>();
    private ArrayList<String> precedentActions = new ArrayList<String>();

    public Answer(String name, String action){
        this.name = name;
        this.action = action;
    }


    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public ArrayList<String> getNextChoices() {
		return nextChoices;
	}

	public void setNextChoices(ArrayList<String> nextChoices) {
		this.nextChoices = nextChoices;
	}
    
    public void addNextChoices(String nextChoice) {
		this.nextChoices.add(nextChoice);
	}

	public ArrayList<String> getPrecedentActions() {
		return precedentActions;
	}
	
	public void setPrecedentActions(ArrayList<String> precedentActions) {
		this.precedentActions = precedentActions;
	}

	public void addPrecedentActions(String precedentAction) {
		this.precedentActions.add(precedentAction);
	}
}

