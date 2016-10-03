/**
 * BasicOperationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.med;

public class BasicOperationServiceLocator extends org.apache.axis.client.Service implements com.med.BasicOperationService {

    public BasicOperationServiceLocator() {
    }


    public BasicOperationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BasicOperationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicOperation
    private java.lang.String BasicOperation_address = "http://localhost:8080/FirstWebService/services/BasicOperation";

    public java.lang.String getBasicOperationAddress() {
        return BasicOperation_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicOperationWSDDServiceName = "BasicOperation";

    public java.lang.String getBasicOperationWSDDServiceName() {
        return BasicOperationWSDDServiceName;
    }

    public void setBasicOperationWSDDServiceName(java.lang.String name) {
        BasicOperationWSDDServiceName = name;
    }

    public com.med.BasicOperation getBasicOperation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicOperation_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicOperation(endpoint);
    }

    public com.med.BasicOperation getBasicOperation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.med.BasicOperationSoapBindingStub _stub = new com.med.BasicOperationSoapBindingStub(portAddress, this);
            _stub.setPortName(getBasicOperationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicOperationEndpointAddress(java.lang.String address) {
        BasicOperation_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.med.BasicOperation.class.isAssignableFrom(serviceEndpointInterface)) {
                com.med.BasicOperationSoapBindingStub _stub = new com.med.BasicOperationSoapBindingStub(new java.net.URL(BasicOperation_address), this);
                _stub.setPortName(getBasicOperationWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicOperation".equals(inputPortName)) {
            return getBasicOperation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://med.com", "BasicOperationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://med.com", "BasicOperation"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicOperation".equals(portName)) {
            setBasicOperationEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
