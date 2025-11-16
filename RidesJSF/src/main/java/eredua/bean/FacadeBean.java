package eredua.bean;

import java.io.Serializable;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;
import dataAccess.DataAccess;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("facade")
@SessionScoped
public class FacadeBean implements Serializable{
	
	 private static BLFacade facadeBL;
	 public FacadeBean() {
		 if(facadeBL==null) {
			 facadeBL=new BLFacadeImplementation (new DataAccess());
		 }
	 }
	 public static BLFacade getFacadeBL() {
		 return facadeBL;
	 }
	 public static void setFacadeBL(BLFacade facadeBL) {
		 FacadeBean.facadeBL = facadeBL;
	 }
	
	
	
	
	
}