package com.model;

import java.sql.Date;

public class ExceptionResponces {
	  private java.util.Date timestamp;
	  private String message;
	  private String details;

	  public ExceptionResponces(java.util.Date timestamp, String message, String details) {
	    super();
	    this.timestamp = timestamp;
	    this.message = message;
	    this.details = details;
	  }

}