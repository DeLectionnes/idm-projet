package lib;
import java.util.ArrayList;

public class Choice {

    private String name;
    private String text;
    private ArrayList<String> answers = new ArrayList<String>();
    private String endingCondition = new Condition();

    public Choice(String n, String t) {
		this.name = n;
        this.text = t;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

    public ArrayList<String> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}
    public void addAnswer(String answer) {
		this.answers.add(answer);
	}

    public String getEndingCondition() {
		return endingCondition;
	}

	public void setEndingCondition(String endingCondition) {
		this.endingCondition = endingCondition;
	}
}
