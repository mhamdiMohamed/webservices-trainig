package com.med;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BasicOperation {
	@WebMethod
	public double multiply(double a, double b){
		return a*b;
	}
	@WebMethod
	public double add(double a, double b){
		return a+b;
	}
	@WebMethod
	public double divide(double a, double b){
		return a/b;
	}
	@WebMethod
	public double substract(double a, double b){
		return a-b;
	}
}
