package com.med;

public class PersonServiceProxy implements com.med.PersonService {
  private String _endpoint = null;
  private com.med.PersonService personService = null;
  
  public PersonServiceProxy() {
    _initPersonServiceProxy();
  }
  
  public PersonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonServiceProxy();
  }
  
  private void _initPersonServiceProxy() {
    try {
      personService = (new com.med.PersonServiceServiceLocator()).getPersonService();
      if (personService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personService != null)
      ((javax.xml.rpc.Stub)personService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.med.PersonService getPersonService() {
    if (personService == null)
      _initPersonServiceProxy();
    return personService;
  }
  
  public java.lang.String deletePerson(int id) throws java.rmi.RemoteException{
    if (personService == null)
      _initPersonServiceProxy();
    return personService.deletePerson(id);
  }
  
  public com.med.Person getPerson(int id) throws java.rmi.RemoteException{
    if (personService == null)
      _initPersonServiceProxy();
    return personService.getPerson(id);
  }
  
  public java.lang.String updatePerson(int id, java.lang.String name, int age) throws java.rmi.RemoteException{
    if (personService == null)
      _initPersonServiceProxy();
    return personService.updatePerson(id, name, age);
  }
  
  public java.lang.Object[] getPersons() throws java.rmi.RemoteException{
    if (personService == null)
      _initPersonServiceProxy();
    return personService.getPersons();
  }
  
  public java.lang.String createPerson(int id, java.lang.String name, int age) throws java.rmi.RemoteException{
    if (personService == null)
      _initPersonServiceProxy();
    return personService.createPerson(id, name, age);
  }
  
  
}