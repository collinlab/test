package mul.camp.a.dto;

import java.io.Serializable;

public class BbsParam implements Serializable{
	private String choice;
	private String search;
	
	public BbsParam() {
	}
	public BbsParam(String choice, String search) {
		super();
		this.choice = choice;
		this.search = search;
	}
	
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}	
	
	@Override
	public String toString() {
		return "BbsParam [choice=" + choice + ", search=" + search + "]";
	}
	

}
