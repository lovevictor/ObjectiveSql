package com.github.braisdom.funcsql;

import java.sql.SQLException;

public interface Persistence<T> {

    void save(T dirtyObject, boolean skipValidation) throws SQLException, PersistenceException;

    T insert(T dirtyObject, boolean skipValidation) throws SQLException, PersistenceException;

    int insert(T[] dirtyObject, boolean skipValidation) throws SQLException, PersistenceException;

    int update(T dirtyObject, boolean skipValidation) throws SQLException, PersistenceException;

    int delete(T dirtyObject) throws SQLException, PersistenceException;
}
