package com.unicoast.project;

import com.unicoast.project.task.controller.TaskController;
import com.unicoast.project.task.model.TaskRepository;
import com.unicoast.project.task.view.TaskView;

public class Main {
    public static void main(String[] args) {
        TaskRepository repository = new TaskRepository();
        TaskController controller = new TaskController(repository);
        TaskView view = new TaskView(controller);

        view.showMenu();
    }
}