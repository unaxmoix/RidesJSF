package eredua.bean;

import java.io.Serializable;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("choice")
@SessionScoped
public class ChoiceBean implements Serializable{
	
	public ChoiceBean(){
	}
	public String create(String m) {
		return m;
	}
	public String query() {
		return "query";
	}
	
}
