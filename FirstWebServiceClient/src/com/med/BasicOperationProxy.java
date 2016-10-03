package com.med;

public class BasicOperationProxy implements com.med.BasicOperation {
  private String _endpoint = null;
  private com.med.BasicOperation basicOperation = null;
  
  public BasicOperationProxy() {
    _initBasicOperationProxy();
  }
  
  public BasicOperationProxy(String endpoint) {
    _endpoint = endpoint;
    _initBasicOperationProxy();
  }
  
  private void _initBasicOperationProxy() {
    try {
      basicOperation = (new com.med.BasicOperationServiceLocator()).getBasicOperation();
      if (basicOperation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)basicOperation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)basicOperation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (basicOperation != null)
      ((javax.xml.rpc.Stub)basicOperation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.med.BasicOperation getBasicOperation() {
    if (basicOperation == null)
      _initBasicOperationProxy();
    return basicOperation;
  }
  
  public double add(double a, double b) throws java.rmi.RemoteException{
    if (basicOperation == null)
      _initBasicOperationProxy();
    return basicOperation.add(a, b);
  }
  
  public double divide(double a, double b) throws java.rmi.RemoteException{
    if (basicOperation == null)
      _initBasicOperationProxy();
    return basicOperation.divide(a, b);
  }
  
  public double multiply(double a, double b) throws java.rmi.RemoteException{
    if (basicOperation == null)
      _initBasicOperationProxy();
    return basicOperation.multiply(a, b);
  }
  
  public double substract(double a, double b) throws java.rmi.RemoteException{
    if (basicOperation == null)
      _initBasicOperationProxy();
    return basicOperation.substract(a, b);
  }
  
  
}