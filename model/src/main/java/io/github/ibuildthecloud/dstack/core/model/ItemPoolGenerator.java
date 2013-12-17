/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "item_pool_generator", schema = "dstack")
public interface ItemPoolGenerator extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.item_pool_generator.id</code>. 
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.item_pool_generator.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.item_pool_generator.name</code>. 
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>dstack.item_pool_generator.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>dstack.item_pool_generator.kind</code>. 
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>dstack.item_pool_generator.kind</code>. 
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>dstack.item_pool_generator.state</code>. 
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>dstack.item_pool_generator.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	public java.lang.String getState();

	/**
	 * Setter for <code>dstack.item_pool_generator.uuid</code>. 
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>dstack.item_pool_generator.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>dstack.item_pool_generator.description</code>. 
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>dstack.item_pool_generator.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 255)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>dstack.item_pool_generator.data</code>. 
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>dstack.item_pool_generator.data</code>. 
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ItemPoolGenerator
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.ItemPoolGenerator from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ItemPoolGenerator
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.ItemPoolGenerator> E into(E into);
}