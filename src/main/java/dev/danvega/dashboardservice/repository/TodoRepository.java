package dev.danvega.dashboardservice.repository;

import dev.danvega.dashboardservice.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo,Integer> {
}
