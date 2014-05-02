/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord> implements org.jooq.Record1<java.lang.String>, org.jooq.test.h2.generatedclasses.tables.interfaces.ITBookStore {

	private static final long serialVersionUID = -1662814010;

	/**
	 * Setter for <code>PUBLIC.T_BOOK_STORE.NAME</code>. The books store name
	 */
	@Override
	public TBookStoreRecord setName(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK_STORE.NAME</code>. The books store name
	 */
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.h2.generatedclasses.tables.TBookStore.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookStoreRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookStoreRecord values(java.lang.String value1) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITBookStore from) {
		setName(from.getName());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITBookStore> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}

	/**
	 * Create a detached, initialised TBookStoreRecord
	 */
	public TBookStoreRecord(java.lang.String name) {
		super(org.jooq.test.h2.generatedclasses.tables.TBookStore.T_BOOK_STORE);

		setValue(0, name);
	}
}