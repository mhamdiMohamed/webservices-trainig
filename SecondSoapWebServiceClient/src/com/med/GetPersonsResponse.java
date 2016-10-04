/**
 * GetPersonsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.med;

public class GetPersonsResponse  implements java.io.Serializable {
    private java.lang.Object[] getPersonsReturn;

    public GetPersonsResponse() {
    }

    public GetPersonsResponse(
           java.lang.Object[] getPersonsReturn) {
           this.getPersonsReturn = getPersonsReturn;
    }


    /**
     * Gets the getPersonsReturn value for this GetPersonsResponse.
     * 
     * @return getPersonsReturn
     */
    public java.lang.Object[] getGetPersonsReturn() {
        return getPersonsReturn;
    }


    /**
     * Sets the getPersonsReturn value for this GetPersonsResponse.
     * 
     * @param getPersonsReturn
     */
    public void setGetPersonsReturn(java.lang.Object[] getPersonsReturn) {
        this.getPersonsReturn = getPersonsReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPersonsResponse)) return false;
        GetPersonsResponse other = (GetPersonsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPersonsReturn==null && other.getGetPersonsReturn()==null) || 
             (this.getPersonsReturn!=null &&
              java.util.Arrays.equals(this.getPersonsReturn, other.getGetPersonsReturn())));
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
        if (getGetPersonsReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetPersonsReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetPersonsReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPersonsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://med.com", ">getPersonsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPersonsReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://med.com", "getPersonsReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://med.com", "item"));
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
