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
 *         &lt;element ref="{}nullable"/>
 *         &lt;element ref="{}pk"/>
 *         &lt;element ref="{}autoIncrement"/>
 *         &lt;element ref="{}type"/>
 *         &lt;element ref="{}unique"/>
 *         &lt;element ref="{}precision"/>
 *         &lt;element ref="{}scale"/>
 *         &lt;element ref="{}fk"/>
 *         &lt;element ref="{}comment"/>
 *         &lt;element ref="{}defaultValue"/>
 *         &lt;element ref="{}javaSqlType"/>
 *         &lt;element ref="{}javaType"/>
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
    "nullable",
    "pk",
    "autoIncrement",
    "type",
    "unique",
    "precision",
    "scale",
    "fk",
    "comment",
    "defaultValue",
    "table",
    "fktablename"
})
@XmlRootElement(name = "Column")
public class Column {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String code;
    protected boolean nullable;
    protected boolean pk;
    protected boolean autoIncrement;
    @XmlElement(required = true)
    protected String type;
    protected boolean unique;
    @XmlElement(required = true)
    protected int precision;
    @XmlElement(required = true)
    protected int scale;
    protected boolean fk;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected String defaultValue;
    @XmlElement(required = true)
    protected int javaSqlType;
    @XmlElement(required = true)
    protected String javaType;
    @XmlElement(required = true)
    protected String fktablename;
    @XmlElement(required = true)
    protected String table;
    
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
     * Obtiene el valor de la propiedad autoIncrement.
     * 
     */
    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    /**
     * Define el valor de la propiedad autoIncrement.
     * 
     */
    public void setAutoIncrement(boolean value) {
        this.autoIncrement = value;
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
     * Obtiene el valor de la propiedad precision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * Define el valor de la propiedad precision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecision(int value) {
        this.precision = value;
    }

    /**
     * Obtiene el valor de la propiedad scale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public int getScale() {
        return scale;
    }

    /**
     * Define el valor de la propiedad scale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(int value) {
        this.scale = value;
    }

    /**
     * Obtiene el valor de la propiedad fk.
     * 
     */
    public boolean isFk() {
        return fk;
    }

    /**
     * Define el valor de la propiedad fk.
     * 
     */
    public void setFk(boolean value) {
        this.fk = value;
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
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
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

	public int getJavaSqlType() {
		return javaSqlType;
	}

	public void setJavaSqlType(int javaSqlType) {
		this.javaSqlType = javaSqlType;
	}

	public String getJavaType() {
		return javaType;
	}

	public void setJavaType(String javaType) {
		this.javaType = javaType;
	}

	public String getFktablename() {
		return fktablename;
	}

	public void setFktablename(String fktablename) {
		this.fktablename = fktablename;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}
 
}
