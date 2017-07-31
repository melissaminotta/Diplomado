
package com.uniajc.smartservices.utilidades;



public class ExceptionUtil extends Exception {

private static final long serialVersionUID = 1L;

private String message;
  
  public ExceptionUtil(String message) {
    this.message = message;
  }

  public ExceptionUtil(String message, String... arguments) {
    this.message = message;
    for (int i = 0; i < arguments.length; i++) {
      message = message.replaceAll("%s" + i, arguments[i]);
    }
  }

  public ExceptionUtil(Exception objException) {
    message = objException.getMessage();
  }

  @Override
  public java.lang.String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public java.lang.String getLocation() {
    StackTraceElement[] objStackTraceElement = this.getStackTrace();
    return (objStackTraceElement[0].getFileName() + ":" + objStackTraceElement[0].getLineNumber());
  }

}
