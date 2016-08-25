package com.scuttler.vegetable.shared;

import com.scuttler.vegetable.common.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("EmbeddedVeg")
public class EmbeddedJdbcVegetableRepository implements VegetableRepository {

    private JdbcOperations jdbc;

    @Autowired
    public EmbeddedJdbcVegetableRepository(JdbcOperations jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Vegetable> getAllVegetables() {
        return jdbc.query(
                "select name, description" +
                        " from Vegetable" +
                        " order by name desc",
                new VegetableRowMapper());
    }

    @Override
    public Vegetable getVegetableByName(String name) {
        return jdbc.queryForObject(
                "select name, description" +
                        " from Vegetable" +
                        " where name = ?",
                new VegetableRowMapper(), name);
    }

    @Override
    public void addVegetable(Vegetable vegetable) {
        jdbc.update(
                "insert into Vegetable (name, description)" +
                        " values (?, ?)",
                vegetable.getName(),
                vegetable.getDescription());
    }

    @Override
    public void deleteVegetableByName(String name) {
        jdbc.update(
                "delete from Vegetable" +
                        " where name = ?",
                name);
    }

    private static class VegetableRowMapper implements RowMapper<Vegetable> {
        public Vegetable mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Vegetable(rs.getString("name"), rs.getString("description"));
        }
    }
}

