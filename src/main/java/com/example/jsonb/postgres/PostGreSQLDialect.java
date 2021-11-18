package com.example.jsonb.postgres;

import java.sql.Types;

import org.hibernate.dialect.PostgreSQL94Dialect;

public class PostGreSQLDialect extends PostgreSQL94Dialect {

	public PostGreSQLDialect() {

		this.registerColumnType(Types.JAVA_OBJECT, "jsonb");
	}

}
