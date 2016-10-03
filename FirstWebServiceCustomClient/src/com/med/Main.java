package com.med;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import javax.xml.ws.WebServiceRef;

public class Main {
	@WebServiceRef
	(wsdlLocation = "http://localhost:8080/FirstWebService/services/BasicOperation?WSDL")
	private static BasicOperationService service;

	/**
	 * @param args
	 *            the command line arguments
	 * @throws ServiceException 
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws ServiceException, RemoteException {
		if (args.length<2) {
			System.err.println("requred tow doubles");
		}
		operation(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}

	private static void operation(double a, double b) throws ServiceException, RemoteException {
		BasicOperationProxy sampleBasicOperationProxyid = new BasicOperationProxy();
		System.out.println(sampleBasicOperationProxyid.add(a, b));
		System.out.println(sampleBasicOperationProxyid.substract(a, b));
		System.out.println(sampleBasicOperationProxyid.multiply(a, b));
		System.out.println(sampleBasicOperationProxyid.divide(a, b));
	}
}
