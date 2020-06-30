package com.jqlu.CourseManagerBack.repository;

import com.jqlu.CourseManagerBack.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {}
