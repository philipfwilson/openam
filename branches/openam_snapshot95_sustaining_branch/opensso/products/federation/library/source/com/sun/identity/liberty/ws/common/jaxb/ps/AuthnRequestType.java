//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ps;


/**
 * Java content class for AuthnRequestType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-protocols-schema.xsd line 69)
 * <p>
 * <pre>
 * &lt;complexType name="AuthnRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:1.0:protocol}RequestAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:iff:2003-08}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}ProviderID"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}AffiliationID" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}NameIDPolicy" minOccurs="0"/>
 *         &lt;element name="ForceAuthn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPassive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}ProtocolProfile" minOccurs="0"/>
 *         &lt;element name="AssertionConsumerServiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}RequestAuthnContext" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}RelayState" minOccurs="0"/>
 *         &lt;element ref="{urn:liberty:iff:2003-08}Scoping" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:liberty:iff:2003-08}consent"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AuthnRequestType
    extends com.sun.identity.liberty.ws.common.jaxb.protocol.RequestAbstractType
{


    /**
     * Gets the value of the forceAuthn property.
     * 
     */
    boolean isForceAuthn();

    /**
     * Sets the value of the forceAuthn property.
     * 
     */
    void setForceAuthn(boolean value);

    /**
     * Gets the value of the affiliationID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAffiliationID();

    /**
     * Sets the value of the affiliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAffiliationID(java.lang.String value);

    /**
     * Gets the value of the Extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.common.jaxb.ps.ExtensionElement}
     * {@link com.sun.identity.liberty.ws.common.jaxb.ps.ExtensionType}
     * 
     */
    java.util.List getExtension();

    /**
     * Gets the value of the nameIDPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getNameIDPolicy();

    /**
     * Sets the value of the nameIDPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setNameIDPolicy(java.lang.String value);

    /**
     * Gets the value of the scoping property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ps.ScopingElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ps.ScopingType}
     */
    com.sun.identity.liberty.ws.common.jaxb.ps.ScopingType getScoping();

    /**
     * Sets the value of the scoping property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ps.ScopingElement}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ps.ScopingType}
     */
    void setScoping(com.sun.identity.liberty.ws.common.jaxb.ps.ScopingType value);

    /**
     * Gets the value of the assertionConsumerServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAssertionConsumerServiceID();

    /**
     * Sets the value of the assertionConsumerServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAssertionConsumerServiceID(java.lang.String value);

    /**
     * Gets the value of the isPassive property.
     * 
     */
    boolean isIsPassive();

    /**
     * Sets the value of the isPassive property.
     * 
     */
    void setIsPassive(boolean value);

    /**
     * Gets the value of the requestAuthnContext property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextElement}
     */
    com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextType getRequestAuthnContext();

    /**
     * Sets the value of the requestAuthnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextElement}
     */
    void setRequestAuthnContext(com.sun.identity.liberty.ws.common.jaxb.ps.RequestAuthnContextType value);

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getProviderID();

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setProviderID(java.lang.String value);

    /**
     * Gets the value of the consent property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getConsent();

    /**
     * Sets the value of the consent property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setConsent(java.lang.String value);

    /**
     * Gets the value of the relayState property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getRelayState();

    /**
     * Sets the value of the relayState property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setRelayState(java.lang.String value);

    /**
     * Gets the value of the protocolProfile property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getProtocolProfile();

    /**
     * Sets the value of the protocolProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setProtocolProfile(java.lang.String value);

}
