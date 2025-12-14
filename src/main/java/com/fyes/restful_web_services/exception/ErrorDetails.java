package com.fyes.restful_web_services.exception;

import java.time.LocalDate;

public class ErrorDetails {
	private LocalDate timestapm;
	private String message;
	public ErrorDetails(LocalDate timestapm, String message, String details) {
		super();
		this.timestapm = timestapm;
		this.message = message;
		Details = details;
	}
	private String Details;
	public LocalDate getTimestapm() {
		return timestapm;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return Details;
	}
}
