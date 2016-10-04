/**
 * PersonService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.med;

public interface PersonService extends java.rmi.Remote {
    public java.lang.String deletePerson(int id) throws java.rmi.RemoteException;
    public com.med.Person getPerson(int id) throws java.rmi.RemoteException;
    public java.lang.String updatePerson(int id, java.lang.String name, int age) throws java.rmi.RemoteException;
    public java.lang.Object[] getPersons() throws java.rmi.RemoteException;
    public java.lang.String createPerson(int id, java.lang.String name, int age) throws java.rmi.RemoteException;
}
