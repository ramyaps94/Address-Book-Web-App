package com.webapp;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


public class CountryDAOImpl implements CountryDAO {
    private JdbcTemplate jdbcTemplateObject;
    public CountryDAOImpl(DataSource dataSource) {
        jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name) {
        String SQL = "insert into countrylist (name) values (?)";

        jdbcTemplateObject.update(SQL, name);
        System.out.println("Created Record Name = " + name);
        return;
    }

    @Override
    public Country getCountry() {
        String SQL = "select * from countrylist ";
        Country country = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{}, new CountryMapper());
        return country;
    }

    @Override
    public List<Country> listCountries() {
        String SQL = "select * from countrylist";
        List<Country> countries = jdbcTemplateObject.query(SQL,
                new CountryMapper());
        return countries;
    }

    @Override
    public void delete(String name1) {
        String SQL = "delete from countrylist WHERE name = name1 ";
        jdbcTemplateObject.update(SQL , name1);
        System.out.println("Deleted Record with name = " + name1);
        return;
    }
}
