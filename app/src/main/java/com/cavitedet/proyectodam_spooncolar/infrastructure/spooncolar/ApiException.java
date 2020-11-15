/*
  Modified from
  https://spoonacular.com/food-api/sdk
 */
package com.cavitedet.proyectodam_spooncolar.infrastructure.spooncolar;

public class ApiException extends Exception {
  int code = 0;
  String message = null;

  public ApiException() {
  }

  public ApiException(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
