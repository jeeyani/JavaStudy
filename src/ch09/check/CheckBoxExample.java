package ch09.check;

public class CheckBoxExample {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		cb.setOnSelectListener(new BackgroundChangeListener());
		cb.select();

	}

}
