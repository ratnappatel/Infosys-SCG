package com.infy.jdbcs;

import java.time.LocalDate;

public class Application {
	
	private int id;
	private int citizenId;
	private LocalDate dateOfApplication;
	private String status;
	private String typeOfApplication;
	public Application() {
		// TODO Auto-generated constructor stub
	}
	public Application(int id, int citizenId, LocalDate dateOfApplication, String status, String typeOfApplication) {
		super();
		this.id = id;
		this.citizenId = citizenId;
		this.dateOfApplication = dateOfApplication;
		this.status = status;
		this.typeOfApplication = typeOfApplication;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}
	public LocalDate getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(LocalDate dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTypeOfApplication() {
		return typeOfApplication;
	}
	public void setTypeOfApplication(String typeOfApplication) {
		this.typeOfApplication = typeOfApplication;
	}
	@Override
	public String toString() {
		return "Application [id=" + id + ", citizenId=" + citizenId + ", dateOfApplication=" + dateOfApplication
				+ ", status=" + status + ", typeOfApplication=" + typeOfApplication + "]";
	}

}
