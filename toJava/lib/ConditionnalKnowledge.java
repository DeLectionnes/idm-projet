package lib;

public class ConditionalKnowledge{

	private String condition = "default";
	private String knowledge;

	public ConditionalKnowledge(String k) {
		this.knowledge = k;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}

}
