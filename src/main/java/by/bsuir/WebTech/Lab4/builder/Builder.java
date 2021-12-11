package by.bsuir.WebTech.Lab4.builder;

import by.bsuir.WebTech.Lab4.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
