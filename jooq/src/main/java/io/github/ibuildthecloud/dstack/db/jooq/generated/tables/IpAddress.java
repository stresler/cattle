/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IpAddress extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord> {

	private static final long serialVersionUID = -1612017957;

	/**
	 * The singleton instance of <code>dstack.ip_address</code>
	 */
	public static final io.github.ibuildthecloud.dstack.db.jooq.generated.tables.IpAddress IP_ADDRESS = new io.github.ibuildthecloud.dstack.db.jooq.generated.tables.IpAddress();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord.class;
	}

	/**
	 * The column <code>dstack.ip_address.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.ip_address.address</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this);

	/**
	 * The column <code>dstack.ip_address.account_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.ip_address.netmask</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.String> NETMASK = createField("netmask", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>dstack.ip_address.gateway</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.String> GATEWAY = createField("gateway", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>dstack.ip_address.version</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>dstack.ip_address.vnet_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.Long> VNET_ID = createField("vnet_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>dstack.ip_address.ip_assignment_type</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.String> IP_ASSIGNMENT_TYPE = createField("ip_assignment_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.ip_address.item_pool_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.Long> ITEM_POOL_ID = createField("item_pool_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>dstack.ip_address.created</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.ip_address.removed</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.ip_address.remove_time</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.sql.Timestamp> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>dstack.ip_address.name</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>dstack.ip_address.description</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this);

	/**
	 * Create a <code>dstack.ip_address</code> table reference
	 */
	public IpAddress() {
		super("ip_address", io.github.ibuildthecloud.dstack.db.jooq.generated.Dstack.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.ip_address</code> table reference
	 */
	public IpAddress(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.db.jooq.generated.Dstack.DSTACK, io.github.ibuildthecloud.dstack.db.jooq.generated.tables.IpAddress.IP_ADDRESS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.IDENTITY_IP_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.KEY_IP_ADDRESS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord>>asList(io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.KEY_IP_ADDRESS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.db.jooq.generated.tables.records.IpAddressRecord, ?>>asList(io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.FK_IP_ADDRESS_ACCOUNT_ID, io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.IP_ADDRESS_IBFK_1, io.github.ibuildthecloud.dstack.db.jooq.generated.Keys.IP_ADDRESS_IBFK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.db.jooq.generated.tables.IpAddress as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.db.jooq.generated.tables.IpAddress(alias);
	}
}