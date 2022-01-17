package lib;

public class ConditionalChoice{

    private String condition = "default";
    private String choice;

    public ConditionalChoice(String choice) {
		this.choice = choice;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

    public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
}
