package com.jqlu.CourseManagerBack.controller;

import com.jqlu.CourseManagerBack.data.ToDo;
import com.jqlu.CourseManagerBack.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id){
        return toDoService.findById(id);
    }

    @PostMapping
    public ToDo create(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @PutMapping("/{id}")
    public ToDo update(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        toDoService.deleteById(id);
    }

}
