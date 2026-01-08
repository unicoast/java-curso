package com.unicoast.project.task.model;

import com.unicoast.project.task.exception.TaskException;
import com.unicoast.project.task.persistence.TaskPersistence;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    // Lógica de negocio

    List<Task> tasks;

    public TaskRepository() {
        // Inicializar la lista con datos o vacía
        tasks = TaskPersistence.loadTasks();
    }

    public void save(Task task) throws TaskException {
        if (tasks.contains(task)){
            throw new TaskException("La tarea ya existe en la base de datos");
        }
        tasks.add(task);
        // Cuando se añade una tarea, se debe sobreescribir toda la lista
        TaskPersistence.saveTasks(tasks);
    }

    public Task findById(String id){
        for (Task task: tasks){
            if (task.getId().equals(id)){
                return task;
            }
        }
        return null;
    }

    public void remove(String id) throws TaskException {
        Task task = findById(id);
        if (task == null){
            throw new TaskException("La tarea no debe ser nula");
        }
        tasks.remove(task);
        // Cuando se elimina una tarea, se debe sobreescribir toda la lista
        TaskPersistence.saveTasks(tasks);
    }

    public void remove(Task task) throws TaskException {

        if (task == null){
            throw new TaskException("La tarea no debe ser nula");
        }

        if (!tasks.contains(task)){
            throw new TaskException("La tarea no fue encontrada en la lista");
        }

        tasks.remove(task);
        // Cuando se elimina una tarea, se debe sobreescribir toda la lista
        TaskPersistence.saveTasks(tasks);
    }

    public List<Task> findAll() throws TaskException {
        if (tasks.isEmpty()){
            throw new TaskException("La lista está vacía");
        }
        return tasks;
    }

    public List<Task> findCompletedTasks() throws TaskException {
        List<Task> completedTask = new ArrayList<>();

        for (Task task: tasks) {
            if (task.getCompleted()){
                completedTask.add(task);
            }
        }

        if (completedTask.isEmpty()){
            throw new TaskException("No hay tareas completadas");
        }

        return completedTask;
    }

    public List<Task> findPendingTasks() throws TaskException {
        List<Task> pendingTasks = new ArrayList<>();

        for (Task task: tasks) {
            if (!task.getCompleted()){
                pendingTasks.add(task);
            }
        }

        if (pendingTasks.isEmpty()){
            throw new TaskException("No hay tareas pendientes");
        }

        return pendingTasks;
    }

    public int findIndexById(String id){
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public void update(Task updateTask) throws TaskException {
        if (updateTask == null){
            throw new TaskException("La tarea no debe ser nula");
        }

        int index = findIndexById(updateTask.getId());

        if (index == -1){
            throw new TaskException("El índice no es correcto");
        }

        tasks.set(index, updateTask);
        // Cuando se actualiza una tarea, se debe sobreescribir toda la lista
        TaskPersistence.saveTasks(tasks);
    }

    public void updateCompleted(String id, Boolean completed) throws TaskException {

        int index = findIndexById(id);

        if (index == -1){
            throw new TaskException("El índice no es correcto");
        }

        tasks.get(index).setCompleted(completed);
        TaskPersistence.saveTasks(tasks);
    }
}
