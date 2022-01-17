package lib;

public class ConditionalAnswer  {

    private String condition = "default";
    private String answer;

    public ConditionalAnswer(String answer) {
		this.answer = answer;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

    public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
