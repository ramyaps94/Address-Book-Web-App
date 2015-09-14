package com.webapp;

import java.util.List;

public interface CountryDAO {
    //public void setDataSource(DataSource dataSource);
    public void create(String name);
    public Country getCountry();
    public List<Country> listCountries();
    public void delete(String name);

}
