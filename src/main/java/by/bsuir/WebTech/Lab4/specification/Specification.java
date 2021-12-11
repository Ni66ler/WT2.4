package by.bsuir.WebTech.Lab4.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
