package com.programmingfree.springservice.controller;

import com.programmingfree.springservice.entity.Task;
import com.programmingfree.springservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	TaskRepository taskRepository;

	@RequestMapping("/home")
	public String home() {
		Task task = new Task();
		task.setTaskArchived(1);
		task.setTaskName("task1");
		task.setTaskDescription("desc");
		task.setTaskPriority("1");
		task.setTaskStatus("mmmm");
		taskRepository.save(task);
		return "index";
	}

}
