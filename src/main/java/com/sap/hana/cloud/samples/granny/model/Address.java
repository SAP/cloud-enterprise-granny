package com.sap.hana.cloud.samples.granny.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Address of a {@link Contact}.
 */

@Entity
@Table(name = "GRANNY_ADDRESS")
public class Address extends BaseObject implements Serializable
{
	/**
	 * The <code>serialVersionUID</code> of the class.
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="TYPE", nullable=true)
	@Enumerated(EnumType.STRING)
	protected AddressType type = null;
	
	@Column(name="STREET", length = 30, nullable=true)
	@Size(max = 30, message = "{api.data_validation.max_length.error}")
	protected String street = null;
	
	@Column(name="STREET2", length = 30, nullable=true)
	@Size(max = 30, message = "{api.data_validation.max_length.error}")
	protected String street2 = null;
	
	@Column(name="CITY", length = 30, nullable=true)
	@Size(max = 30, message = "{api.data_validation.max_length.error}")
	protected String city = null;
	
	@Column(name="ZIP", length = 8, nullable=true)
	@Size(max = 8, message = "{api.data_validation.max_length.error}")
	protected String zipCode = null;
	
	@Column(name="STATE", length = 20, nullable=true)
	@Size(max = 20, message = "{api.data_validation.max_length.error}")
	protected String state = null;
	
	@Column(name="COUNTRY", length = 3, nullable=true)
	@Size(max = 3, message = "{api.data_validation.max_length.error}")
	protected String country = null;

	public AddressType getType()
	{
		return type;
	}

	public void setType(AddressType type)
	{
		this.type = type;
	}

	public String getStreet()
	{
		return street;
	}

	public void setStreet(String street)
	{
		this.street = street;
	}

	public String getStreet2()
	{
		return street2;
	}

	public void setStreet2(String street2)
	{
		this.street2 = street2;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
	    return new ToStringBuilder(this).appendSuper(super.toString()).append("type", this.type).append("street", this.street).append("street2", this.street2)
	    	   .append("zipCode", this.zipCode).append("city", this.city).append("country", this.country)
	           .append("state", this.state).toString();
	}
}
