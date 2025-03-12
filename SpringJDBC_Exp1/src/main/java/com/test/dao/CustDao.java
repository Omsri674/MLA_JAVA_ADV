package com.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.test.model.Customer;

public class CustDao {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createCust(Customer c) {
		String sql = "insert into customer(name,type) values('" + c.getName() + "','" + c.getType() + "')";

		jdbcTemplate.execute(sql);
	}

	public void UpdateCust(Customer c) {
		String sql = "update customer set name= '" + c.getName() + "',type='" + c.getType() + "' where id = "
				+ c.getId();
		jdbcTemplate.execute(sql);
	}

	public void DeleteCust(Customer c) {
		String sql = "delete from customer where id=" + c.getId();
		jdbcTemplate.execute(sql);

	}

	public List<Customer> getAllCust() {

		return jdbcTemplate.query("select * from customer", new ResultSetExtractor<List<Customer>>() {

			@Override
			public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub

				List<Customer> listdata = new ArrayList<>();
				while (rs.next()) {
					Customer obj = new Customer();
					obj.setId(rs.getInt(1));
					obj.setName(rs.getString(2));
					obj.setType(rs.getString(3));

					listdata.add(obj);

				}
				return listdata;
			}

		});

	}
}
