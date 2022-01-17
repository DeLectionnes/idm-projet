package lib;

public class ConditionalAction{

    private String condition = new Condition();
    private String action;

    public ConditionalAction(String action) {
		this.action = action;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

    public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
