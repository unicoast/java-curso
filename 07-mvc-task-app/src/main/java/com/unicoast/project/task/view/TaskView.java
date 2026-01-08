package com.unicoast.project.task.view;

import com.unicoast.project.task.controller.TaskController;
import com.unicoast.project.task.exception.TaskException;
import com.unicoast.project.task.exception.TaskValidationException;
import com.unicoast.project.task.model.Task;

import java.util.Scanner;

public class TaskView {
    private final TaskController taskController;
    private final Scanner scanner;

    public TaskView(TaskController taskController) {
        this.taskController = taskController;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu(){
        while(true){
            System.out.println("----------------------------");
            System.out.println("Gestión de Tareas");
            System.out.println("----------------------------");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Eliminar Tarea");
            System.out.println("3. Actualizar Tarea");
            System.out.println("4. Actualizar Estado de Tarea");
            System.out.println("5. Mostrar Tareas");
            System.out.println("6. Mostrar Tareas Completadas");
            System.out.println("7. Mostrar Tareas Pendientes");
            System.out.println("8. Salir");
            System.out.println("----------------------------");
            System.out.println("Seleccione una opción:");

            String option = scanner.nextLine();
            switch (option){
                case "1":
                    addTaskView();
                    break;
                case "2":
                    removeTaskView();
                    break;
                case "3":
                    updateTaskView();
                    break;
                case "4":
                    updateTaskCompletedView();
                    break;
                case "5":
                    showTaskView();
                    break;
                case "6":
                    showCompletedTasks();
                    break;
                case "7":
                    showPendingTasksView();
                    break;
                case "8":
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción incorrecta, intente nuevamente");
            }
        }
    }

    public void addTaskView(){
        try {
            Task task = getTaskInput();
            taskController.addTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());

            System.out.println("Tarea agregada exitosamente");
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado. Contacto con soporte del programa");
            e.printStackTrace();
        }
    }

    public void removeTaskView(){
        try {
            System.out.println("Ingrese el ID a eliminar");
            String id = scanner.nextLine();
            this.taskController.removeTask(id);

            System.out.println("Tarea eliminada exitosamente");
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado. Contacte con soporte");
        }
    }

    public void updateTaskView(){
        try {
            Task task = getTaskInput();
            taskController.updateTask(task.getId(), task.getTitle(), task.getDescription(), task.getCompleted());

            System.out.println("Tarea actualizada exitosamente");
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado. Contacto con soporte del programa");
            e.printStackTrace();
        }
    }

    public void updateTaskCompletedView(){
        try {
            System.out.println("Ingrese el ID de la tarea");
            String id = scanner.nextLine();
            Boolean completed = null;
            while (completed == null) {
                System.out.println("¿Está completada? true/false");
                String input = scanner.next().trim().toLowerCase();

                if (input.equals("true")){
                    completed = true;
                } else if(input.equals("false")){
                    completed = false;
                } else {
                    System.out.println("El valor ingresado no es correcto. Ingrese: 'true' o 'false'");
                }
            }
            taskController.updateTaskCompleted(id, completed);

            System.out.println("Estado de la tarea actualizado exitosamente");
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado. Contacto con soporte del programa");
            e.printStackTrace();
        }
    }

    public void showCompletedTasks(){
        try{
            System.out.println("\nTareas Completadas");
            taskController.showCompletedTasks();
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showPendingTasksView(){
        try{
            System.out.println("\nTareas Pendientes");
            taskController.showPendingTasks();
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showTaskView(){
        try {
            System.out.println("\n Lista de Tareas");
            this.taskController.showAllTasks();
        } catch (TaskValidationException | TaskException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado. Contacto con soporte del programa");
        }
    }

    private Task getTaskInput(){
        String id;
        String title;
        String description;
        Boolean completed = null;

        do {
            System.out.println("Ingresar ID");
            id = scanner.nextLine();

            if (id.trim().isEmpty()){
                System.out.println("El id no puede estar vacío");
            }
        } while (id.trim().isEmpty());

        do {
            System.out.println("Ingrese el título");
            title = scanner.nextLine();

            if (title.trim().isEmpty()){
                System.out.println("El título no puede estar vacío");
            }
        } while (title.trim().isEmpty());

        do {
            System.out.println("Ingrese descripción");
            description = scanner.nextLine();

            if (description.trim().isEmpty()){
                System.out.println("La descripción no puede estar vacía");
            }
        } while (description.trim().isEmpty());


        while (completed == null) {
            System.out.println("¿Está completada? true/false");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("true")){
                completed = true;
            } else if(input.equals("false")){
                completed = false;
            } else {
                System.out.println("El valor ingresado no es correcto. Ingrese: 'true' o 'false'");
            }
        }

        return new Task(id, title, description, completed);
    }
}
