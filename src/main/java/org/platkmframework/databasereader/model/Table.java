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
 *         &lt;element ref="{}name"/>
 *         &lt;element ref="{}type"/>
 *         &lt;element ref="{}order"/>
 *         &lt;element ref="{}comment"/>
 *         &lt;element ref="{}Column" maxOccurs="unbounded"/>
 *         &lt;element ref="{}pkContraint"/>
 *         &lt;element ref="{}FkContraint" maxOccurs="unbounded"/>
 *         &lt;element ref="{}IndexContraint" maxOccurs="unbounded"/>
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
    "label",
    "code",
    "type",
    "order",
    "comment",
    "column",
    "pkContraint",
    "fkContraint",
    "indexContraint"
})
@XmlRootElement(name = "Table")
public class Table {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String type;
    protected int order;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(name = "Column", required = true)
    protected List<Column> column;
    @XmlElement(required = true)
    protected PkContraint pkContraint;
    @XmlElement(name = "FkContraint", required = true)
    protected List<FkContraint> fkContraint;
    @XmlElement(name = "IndexContraint", required = true)
    protected List<IndexContraint> indexContraint;
    

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
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Column }
     * 
     * 
     */
    public List<Column> getColumn() {
        if (column == null) {
            column = new ArrayList<Column>();
        }
        return this.column;
    }

    /**
     * Obtiene el valor de la propiedad pkContraint.
     * 
     * @return
     *     possible object is
     *     {@link PkContraint }
     *     
     */
    public PkContraint getPkContraint() {
        return pkContraint;
    }

    /**
     * Define el valor de la propiedad pkContraint.
     * 
     * @param value
     *     allowed object is
     *     {@link PkContraint }
     *     
     */
    public void setPkContraint(PkContraint value) {
        this.pkContraint = value;
    }

    /**
     * Gets the value of the fkContraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fkContraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFkContraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FkContraint }
     * 
     * 
     */
    public List<FkContraint> getFkContraint() {
        if (fkContraint == null) {
            fkContraint = new ArrayList<FkContraint>();
        }
        return this.fkContraint;
    }

    /**
     * Gets the value of the indexContraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexContraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexContraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexContraint }
     * 
     * 
     */
    public List<IndexContraint> getIndexContraint() {
        if (indexContraint == null) {
            indexContraint = new ArrayList<IndexContraint>();
        }
        return this.indexContraint;
    }

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setColumn(List<Column> column) {
		this.column = column;
	}

	public void setFkContraint(List<FkContraint> fkContraint) {
		this.fkContraint = fkContraint;
	}

	public void setIndexContraint(List<IndexContraint> indexContraint) {
		this.indexContraint = indexContraint;
	}

}
