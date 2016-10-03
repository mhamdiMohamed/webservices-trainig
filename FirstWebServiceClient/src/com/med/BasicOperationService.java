/**
 * BasicOperationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.med;

public interface BasicOperationService extends javax.xml.rpc.Service {
    public java.lang.String getBasicOperationAddress();

    public com.med.BasicOperation getBasicOperation() throws javax.xml.rpc.ServiceException;

    public com.med.BasicOperation getBasicOperation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
