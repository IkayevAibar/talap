package com.example.talap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TasksController {

	@GetMapping("/tasks")
	public String tasksPage(Model model) {
		model.addAttribute("task1", new Task1());
		model.addAttribute("task2", new Task2());
		model.addAttribute("task3", new Task3());
		return "tasks";
	}

	@PostMapping("/tasks")
	public String tasksSubmit(@ModelAttribute("task1") Task1 task1,
			@ModelAttribute("task2") Task2 task2,
			@ModelAttribute("task3") Task3 task3,
			Model model) {

		if (task1.getNumbers() != null) {
			String[] numbersAsString = task1.getNumbers().split(",");
			int[] numbers = new int[numbersAsString.length];

			for (int i = 0; i < numbersAsString.length; i++) {
				try {
					numbers[i] = Integer.parseInt(numbersAsString[i].trim());
				} catch (NumberFormatException e) {
					task1.setErrorMessage("Некорректный формат числа: " + numbersAsString[i]);
					numbers[i] = 0;
				}
			}
		}

		if (task3.getNumber() != null) {
			try {
				Integer.parseInt(task3.getNumber().trim());
			} catch (NumberFormatException e) {
				task3.setErrorMessage("Некорректный формат числа: " + task3.getNumber());
				task3.setNumber("0");
			}
		}

		model.addAttribute("task1", task1);
		model.addAttribute("task2", task2);
		model.addAttribute("task3", task3);
		return "tasks";
	}

}