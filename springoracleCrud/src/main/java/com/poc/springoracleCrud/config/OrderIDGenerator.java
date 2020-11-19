package com.poc.springoracleCrud.config;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIDGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) {

		String prefix = "ORD";
		Connection connection = session.connection();

		try (Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select count(order_id) as Id from orderdetailss")) {
			
			if (rs.next()) {
				int id = rs.getInt(1) + 101;
				return prefix + id;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}
