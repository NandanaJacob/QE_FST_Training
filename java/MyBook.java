package activities;

public class MyBook extends Book{
	public void setTitle(String s) {
		if(s!=null && !s.isEmpty())
			title = s;
	}

}
