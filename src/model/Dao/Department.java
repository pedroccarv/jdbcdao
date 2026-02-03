package model.Dao;

import java.util.List;

public interface Department {

    void insert(Department department);
    void update(Department department);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
