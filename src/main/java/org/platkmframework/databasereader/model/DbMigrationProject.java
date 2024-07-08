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
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}SourceDataBase"/>
 *         &lt;element ref="{}TargetDataBase"/>
 *         &lt;element ref="{}DbMigrationMapping"/>
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
    "name",
    "sourceDataBase",
    "targetDataBase",
    "dbMigrationMapping"
})
@XmlRootElement(name = "DbMigrationProject")
public class DbMigrationProject {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "SourceDataBase", required = true)
    protected SourceDataBase sourceDataBase;
    @XmlElement(name = "TargetDataBase", required = true)
    protected TargetDataBase targetDataBase;
    @XmlElement(name = "DbMigrationMapping", required = true)
    protected DbMigrationMapping dbMigrationMapping;

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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceDataBase.
     * 
     * @return
     *     possible object is
     *     {@link SourceDataBase }
     *     
     */
    public SourceDataBase getSourceDataBase() {
        return sourceDataBase;
    }

    /**
     * Define el valor de la propiedad sourceDataBase.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceDataBase }
     *     
     */
    public void setSourceDataBase(SourceDataBase value) {
        this.sourceDataBase = value;
    }

    /**
     * Obtiene el valor de la propiedad targetDataBase.
     * 
     * @return
     *     possible object is
     *     {@link TargetDataBase }
     *     
     */
    public TargetDataBase getTargetDataBase() {
        return targetDataBase;
    }

    /**
     * Define el valor de la propiedad targetDataBase.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetDataBase }
     *     
     */
    public void setTargetDataBase(TargetDataBase value) {
        this.targetDataBase = value;
    }

    /**
     * Obtiene el valor de la propiedad dbMigrationMapping.
     * 
     * @return
     *     possible object is
     *     {@link DbMigrationMapping }
     *     
     */
    public DbMigrationMapping getDbMigrationMapping() {
        return dbMigrationMapping;
    }

    /**
     * Define el valor de la propiedad dbMigrationMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link DbMigrationMapping }
     *     
     */
    public void setDbMigrationMapping(DbMigrationMapping value) {
        this.dbMigrationMapping = value;
    }

}
