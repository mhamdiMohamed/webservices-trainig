/**
 * DeletePersonResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.med;

public class DeletePersonResponse  implements java.io.Serializable {
    private java.lang.String deletePersonReturn;

    public DeletePersonResponse() {
    }

    public DeletePersonResponse(
           java.lang.String deletePersonReturn) {
           this.deletePersonReturn = deletePersonReturn;
    }


    /**
     * Gets the deletePersonReturn value for this DeletePersonResponse.
     * 
     * @return deletePersonReturn
     */
    public java.lang.String getDeletePersonReturn() {
        return deletePersonReturn;
    }


    /**
     * Sets the deletePersonReturn value for this DeletePersonResponse.
     * 
     * @param deletePersonReturn
     */
    public void setDeletePersonReturn(java.lang.String deletePersonReturn) {
        this.deletePersonReturn = deletePersonReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeletePersonResponse)) return false;
        DeletePersonResponse other = (DeletePersonResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deletePersonReturn==null && other.getDeletePersonReturn()==null) || 
             (this.deletePersonReturn!=null &&
              this.deletePersonReturn.equals(other.getDeletePersonReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDeletePersonReturn() != null) {
            _hashCode += getDeletePersonReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeletePersonResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://med.com", ">deletePersonResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletePersonReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://med.com", "deletePersonReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
