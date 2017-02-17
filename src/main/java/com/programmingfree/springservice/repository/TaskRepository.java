package com.programmingfree.springservice.repository;

import java.util.List;

import com.programmingfree.springservice.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/*
TaskRepository extends CrudRepository. The type of entity and ID it works with,
Task and Long are specified as generic parameters to CrudRepository.
 By extending CrudRepository, TaskRepository inherits several methods
 for working with Task persistence, including methods for saving, deleting, and finding Task entities.
 */
@RepositoryRestResource
/*
ou can see @RepositoryRestResource annotation being used.
This annotation is responsible for exposing this repository interface as a RESTFul resource.
 This is pretty much similar to @RestController which we used in plain Spring MVC REST to expose a
 controller as RESTFul resource.

 */
public interface TaskRepository extends CrudRepository<Task, Integer> {
/*
Spring Data JPA also allows you to define other query methods by simply declaring their method signature.
 */
	List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
	List<Task> findByTaskStatus(@Param("status") String taskStatus);

}
