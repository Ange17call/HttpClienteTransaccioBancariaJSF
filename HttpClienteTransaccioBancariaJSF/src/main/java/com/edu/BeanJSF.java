package com.edu;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;



@ManagedBean
@RequestScoped
public class BeanJSF {
	
	@PostConstruct
	protected void init() {
		
		ApplicationContext context = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());

		tB = context.getBean(TransaccionBancaria.class);
		
	}
	private String cuenta1 = "";
	private String cuenta2 = "";
	private float monto=0;
	private TransaccionBancaria tB;
	

	public String getCuenta2() {
		return cuenta2;
	}

	public void setCuenta2(String cuenta2) {
		this.cuenta2 = cuenta2;
	}

	public String getCuenta1() {
		return cuenta1;
	}

	public void setCuenta1(String cuenta1) {
		this.cuenta1 = cuenta1;
	}

	
	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public String transferir(){
		String retorno=tB.realizarTransferencia(cuenta1, cuenta2, monto);
		if(retorno.equals("Transaccion Exitosa")){
			return "exito";//exito.xhtml
		}else{
			return "fallo";//fallo.xhtml
		}
		
		
		
	}
	
}
