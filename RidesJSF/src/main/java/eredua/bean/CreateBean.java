package eredua.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import domain.Ride;
import exceptions.*;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("create")
@SessionScoped
public class CreateBean implements Serializable{
	private String nora;
	private String nondik;
	private int eserKop;
	private float prezioa;
	private Date data;
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	private FacadeBean facade=new FacadeBean();
	private ChoiceBean menP=new ChoiceBean();
	public CreateBean() {}
	
	public String getNora() {
		return nora;
	}
	public void setNora(String nora) {
		this.nora = nora;
	}
	public String getNondik() {
		return nondik;
	}
	public void setNondik(String nondik) {
		this.nondik = nondik;
	}
	public int getEserKop() {
		return eserKop;
	}
	public void setEserKop(int eserKop) {
		this.eserKop = eserKop;
	}
	public float getPrezioa() {
		return prezioa;
	}
	public void setPrezioa(float prezioa) {
		this.prezioa = prezioa;
	}
	
	public Date getTomorrow() {
	    Calendar c = Calendar.getInstance();
	    c.add(Calendar.DAY_OF_YEAR, 1);  
	    return c.getTime();
	}
	
	public void createRide() throws RideMustBeLaterThanTodayException, RideAlreadyExistException{
		Ride r=facade.getFacadeBL().createRide(nondik, nora, data, eserKop, prezioa, menP.getDriver().getEmail());
	}
	
	
	
	
	
	
	
	
}