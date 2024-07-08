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

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}fkName"/>
 *         &lt;element ref="{}pkTableName"/>
 *         &lt;element ref="{}fkTableName"/>
 *         &lt;element ref="{}ImportedKey" maxOccurs="unbounded"/>
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
    "fkName",
    "pkTableName",
    "fkTableName",
    "importedKey"
})
@XmlRootElement(name = "FkContraint")
public class FkContraint {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String fkName;
    @XmlElement(required = true)
    protected String pkTableName;
    @XmlElement(required = true)
    protected String fkTableName;
    @XmlElement(name = "ImportedKey", required = true)
    protected List<ImportedKey> importedKey;

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
     * Obtiene el valor de la propiedad fkName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkName() {
        return fkName;
    }

    /**
     * Define el valor de la propiedad fkName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkName(String value) {
        this.fkName = value;
    }

    /**
     * Obtiene el valor de la propiedad pkTableName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkTableName() {
        return pkTableName;
    }

    /**
     * Define el valor de la propiedad pkTableName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkTableName(String value) {
        this.pkTableName = value;
    }

    /**
     * Obtiene el valor de la propiedad fkTableName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkTableName() {
        return fkTableName;
    }

    /**
     * Define el valor de la propiedad fkTableName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkTableName(String value) {
        this.fkTableName = value;
    }

    /**
     * Gets the value of the importedKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importedKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportedKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportedKey }
     * 
     * 
     * @return 
     */
    public List<ImportedKey> getImportedKey() {
        if (importedKey == null) {
            importedKey = new ArrayList<>();
        }
        return this.importedKey;
    }

}
