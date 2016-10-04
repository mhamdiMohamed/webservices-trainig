/**
 * GetPersonResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.med;

public class GetPersonResponse  implements java.io.Serializable {
    private com.med.Person getPersonReturn;

    public GetPersonResponse() {
    }

    public GetPersonResponse(
           com.med.Person getPersonReturn) {
           this.getPersonReturn = getPersonReturn;
    }


    /**
     * Gets the getPersonReturn value for this GetPersonResponse.
     * 
     * @return getPersonReturn
     */
    public com.med.Person getGetPersonReturn() {
        return getPersonReturn;
    }


    /**
     * Sets the getPersonReturn value for this GetPersonResponse.
     * 
     * @param getPersonReturn
     */
    public void setGetPersonReturn(com.med.Person getPersonReturn) {
        this.getPersonReturn = getPersonReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPersonResponse)) return false;
        GetPersonResponse other = (GetPersonResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPersonReturn==null && other.getGetPersonReturn()==null) || 
             (this.getPersonReturn!=null &&
              this.getPersonReturn.equals(other.getGetPersonReturn())));
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
        if (getGetPersonReturn() != null) {
            _hashCode += getGetPersonReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPersonResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://med.com", ">getPersonResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPersonReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://med.com", "getPersonReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://med.com", "Person"));
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
