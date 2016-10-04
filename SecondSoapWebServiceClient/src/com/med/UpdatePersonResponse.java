/**
 * UpdatePersonResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.med;

public class UpdatePersonResponse  implements java.io.Serializable {
    private java.lang.String updatePersonReturn;

    public UpdatePersonResponse() {
    }

    public UpdatePersonResponse(
           java.lang.String updatePersonReturn) {
           this.updatePersonReturn = updatePersonReturn;
    }


    /**
     * Gets the updatePersonReturn value for this UpdatePersonResponse.
     * 
     * @return updatePersonReturn
     */
    public java.lang.String getUpdatePersonReturn() {
        return updatePersonReturn;
    }


    /**
     * Sets the updatePersonReturn value for this UpdatePersonResponse.
     * 
     * @param updatePersonReturn
     */
    public void setUpdatePersonReturn(java.lang.String updatePersonReturn) {
        this.updatePersonReturn = updatePersonReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatePersonResponse)) return false;
        UpdatePersonResponse other = (UpdatePersonResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updatePersonReturn==null && other.getUpdatePersonReturn()==null) || 
             (this.updatePersonReturn!=null &&
              this.updatePersonReturn.equals(other.getUpdatePersonReturn())));
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
        if (getUpdatePersonReturn() != null) {
            _hashCode += getUpdatePersonReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatePersonResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://med.com", ">updatePersonResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatePersonReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://med.com", "updatePersonReturn"));
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
