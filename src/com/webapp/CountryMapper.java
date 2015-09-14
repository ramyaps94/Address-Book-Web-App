package com.webapp;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ramyaps on 07/09/15.
 */

public class CountryMapper implements RowMapper<Country> {
        public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
            Country country = new Country();
            country.setName(rs.getString("name"));
            return country;
        }
    }
