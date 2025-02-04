/**
 * ****************************************************************************
 *  Copyright(c) 2023 the original author Eduardo Iglesias Taylor.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  	 https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  Contributors:
 *  	Eduardo Iglesias Taylor - initial API and implementation
 * *****************************************************************************
 */
//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2019.12.27 a las 03:01:20 PM CST
//
package org.platkmframework.databasereader.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 *   Author:
 *     Eduardo Iglesias
 *   Contributors:
 *   	Eduardo Iglesias - initial API and implementation
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "id", "fkName", "pkTableName", "fkTableName", "importedKey" })
@XmlRootElement(name = "FkContraint")
public class FkContraint implements Serializable {

    /**
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atributo id
     */
    @XmlElement(required = true)
    protected String id;

    /**
     * Atributo fkName
     */
    @XmlElement(required = true)
    protected String fkName;

    /**
     * Atributo pkTableName
     */
    @XmlElement(required = true)
    protected String pkTableName;

    /**
     * Atributo fkTableName
     */
    @XmlElement(required = true)
    protected String fkTableName;

    /**
     * Atributo importedKey
     */
    @XmlElement(name = "ImportedKey", required = true)
    protected List<ImportedKey> importedKey;
    
    
    
    /**
     * FkContraint
     */
    public FkContraint() {
		super();
	}

	/**
     * Obtiene el valor de la propiedad id.
     *
     * @return
     *     possible object is
     *     {@link String }
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
     */
    public void setFkTableName(String value) {
        this.fkTableName = value;
    }

    /**
     * Devuelve el listado de objetos con información de llas llaves foráneas
     *
     * @return
     *     possible object is
     *     {@link ImportedKey }
     */
    public List<ImportedKey> getImportedKey() {
        if (importedKey == null) {
            importedKey = new ArrayList<>();
        }
        return this.importedKey;
    }
}
