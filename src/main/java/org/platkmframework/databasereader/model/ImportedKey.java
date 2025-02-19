/*******************************************************************************
 * Copyright(c) 2023 the original author Eduardo Iglesias Taylor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	 https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * 	Eduardo Iglesias Taylor - initial API and implementation
 *******************************************************************************/
//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.12.27 a las 03:01:20 PM CST 
//


package org.platkmframework.databasereader.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 *   Author: 
 *     Eduardo Iglesias
 *   Contributors: 
 *   	Eduardo Iglesias - initial API and implementation
 **/
/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}id"/>
 *         &lt;element ref="{}pkColumnName"/>
 *         &lt;element ref="{}fkColumnName"/>
 *         &lt;element ref="{}keySeq"/>
 *         &lt;element ref="{}nullable"/>
 *         &lt;element ref="{}pk"/>
 *         &lt;element ref="{}unique"/>
 *         &lt;element ref="{}updateRule"/>
 *         &lt;element ref="{}deleteRule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "pkColumnName",
    "fkColumnName",
    "keySeq",
    "nullable",
    "pk",
    "unique",
    "updateRule",
    "deleteRule",
    "pkTableName"
})
@XmlRootElement(name = "ImportedKey")
public class ImportedKey {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String pkColumnName;
    @XmlElement(required = true)
    protected String fkColumnName;
    @XmlElement(required = true)
    protected String keySeq;
    protected boolean nullable;
    protected boolean pk;
    protected boolean unique;
    @XmlElement(required = true)
    protected String updateRule;
    @XmlElement(required = true)
    protected String deleteRule;
    @XmlElement(required = true)
    protected String pkTableName;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad pkColumnName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkColumnName() {
        return pkColumnName;
    }

    /**
     * Define el valor de la propiedad pkColumnName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkColumnName(String value) {
        this.pkColumnName = value;
    }

    /**
     * Obtiene el valor de la propiedad fkColumnName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkColumnName() {
        return fkColumnName;
    }

    /**
     * Define el valor de la propiedad fkColumnName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkColumnName(String value) {
        this.fkColumnName = value;
    }

    /**
     * Obtiene el valor de la propiedad keySeq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySeq() {
        return keySeq;
    }

    /**
     * Define el valor de la propiedad keySeq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySeq(String value) {
        this.keySeq = value;
    }

    /**
     * Obtiene el valor de la propiedad nullable.
     * 
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * Define el valor de la propiedad nullable.
     * 
     */
    public void setNullable(boolean value) {
        this.nullable = value;
    }

    /**
     * Obtiene el valor de la propiedad pk.
     * 
     */
    public boolean isPk() {
        return pk;
    }

    /**
     * Define el valor de la propiedad pk.
     * 
     */
    public void setPk(boolean value) {
        this.pk = value;
    }

    /**
     * Obtiene el valor de la propiedad unique.
     * 
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * Define el valor de la propiedad unique.
     * 
     */
    public void setUnique(boolean value) {
        this.unique = value;
    }

    /**
     * Obtiene el valor de la propiedad updateRule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateRule() {
        return updateRule;
    }

    /**
     * Define el valor de la propiedad updateRule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateRule(String value) {
        this.updateRule = value;
    }

    /**
     * Obtiene el valor de la propiedad deleteRule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteRule() {
        return deleteRule;
    }

    /**
     * Define el valor de la propiedad deleteRule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteRule(String value) {
        this.deleteRule = value;
    }

    public String getPkTableName() {
        return pkTableName;
    }

    public void setPkTableName(String pkTableName) {
        this.pkTableName = pkTableName;
    }

}
