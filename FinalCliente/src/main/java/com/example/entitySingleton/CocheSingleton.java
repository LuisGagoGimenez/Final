package com.example.entitySingleton;

public class CocheSingleton {
	
	private static CocheSingleton instance;
	
	private Boolean ruedas;
	private Boolean motor;
	private Boolean aceite;
	private String status;
	
	private CocheSingleton() {
		
	}
	
	public static CocheSingleton getInstance() {
		if(instance == null) {
			instance = new CocheSingleton();
		}
		return instance;
	}

	public Boolean getRuedas() {
		return ruedas;
	}

	public void setRuedas(Boolean ruedas) {
		this.ruedas = ruedas;
	}

	public Boolean getMotor() {
		return motor;
	}

	public void setMotor(Boolean motor) {
		this.motor = motor;
	}

	public Boolean getAceite() {
		return aceite;
	}

	public void setAceite(Boolean aceite) {
		this.aceite = aceite;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
