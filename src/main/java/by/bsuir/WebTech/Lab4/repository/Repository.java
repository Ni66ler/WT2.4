package by.bsuir.WebTech.Lab4.repository;

import by.bsuir.WebTech.Lab4.exception.RepositoryException;
import by.bsuir.WebTech.Lab4.specification.Specification;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface Repository<T> {


    Optional<T> query(Specification specification) throws RepositoryException;


    List<T> queryAll(Specification specification) throws RepositoryException;


    void save(T item) throws RepositoryException;

    String getTableName();


    Map<String, Object> getFields(T item);
}
