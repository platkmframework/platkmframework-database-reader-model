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
 *         &lt;element ref="{}tableSourceId"/>
 *         &lt;element ref="{}tableTargetId"/>
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
    "tableSourceId",
    "tableTargetId"
})
@XmlRootElement(name = "TableMapping")
public class TableMapping {

    @XmlElement(required = true)
    protected String tableSourceId;
    @XmlElement(required = true)
    protected String tableTargetId;

    /**
     * Obtiene el valor de la propiedad tableSourceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableSourceId() {
        return tableSourceId;
    }

    /**
     * Define el valor de la propiedad tableSourceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableSourceId(String value) {
        this.tableSourceId = value;
    }

    /**
     * Obtiene el valor de la propiedad tableTargetId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableTargetId() {
        return tableTargetId;
    }

    /**
     * Define el valor de la propiedad tableTargetId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableTargetId(String value) {
        this.tableTargetId = value;
    }

}
