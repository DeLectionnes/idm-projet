package lib;

public class ConditionalItem {
	
	private String condition = "default";
	private String item;

	public ConditionalItem(String i) {
		this.setItem(i);
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}
