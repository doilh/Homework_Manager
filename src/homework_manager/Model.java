/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_manager;

import java.util.Arrays;

/**
 *
 * @author doilhan
 */
public class Model {

    int taskCount = 0;
    Task[] tasks = new Task[100];
    FileHelper helper = new FileHelper();

    Model() {
        String lines[] = helper.readTasks();
        taskCount = lines.length;
        for (int i = 0; i < taskCount; i++) {
            tasks[i] = new Task();
            String taskLine[] = lines[i].split("#");
            tasks[i].setTitle(taskLine[0]);
            tasks[i].setDescription(taskLine[1]);
            tasks[i].setPriority(taskLine[2]);
            tasks[i].setDeadline(taskLine[3]);
            tasks[i].setDeadlinehr(taskLine[4]);
        }

    }

    void add(String title, String description, String priority, String deadline, String deadlinehr) {
        Task task = new Task();
        task.setDescription(description);
        task.setTitle(title);
        task.setPriority(priority);
        task.setDeadline(deadline);
        task.setDeadlinehr(deadlinehr);
        tasks[taskCount] = task;
        taskCount = taskCount + 1;
        helper.writeTasks(getTaskContent());
    }

    void remove(int index) {
        helper.writeTasks(removeTasks(index));
        for (int i = index; i < taskCount; i = i + 1) {
            tasks[i] = tasks[i + 1];
        }
        taskCount = taskCount - 1;
    }

    void edit(int index, String title, String description, String priority, String deadline, String deadlinehr) {
        tasks[index].setDescription(description);
        tasks[index].setTitle(title);
        tasks[index].setPriority(priority);
        tasks[index].setDeadline(deadline);
        tasks[index].setDeadlinehr(deadlinehr);
        helper.writeTasks(getTaskContent());
    }

    String[] getTasks() {
        String[] tmpTasks = new String[taskCount];
        for (int i = 0; i < taskCount; i++) {
            tmpTasks[i] = tasks[i].getTitle();
        }
        return tmpTasks;
    }

    String[] removeTasks(int index) {
        String[] tmpTasksContent = new String[taskCount];
        for (int i = 0; i < taskCount; i++) {
            if (i == index) {
                tmpTasksContent[i] = null;
            } else {
                tmpTasksContent[i] = tasks[i].getTitle() + "#"
                        + tasks[i].getDescription() + "#"
                        + tasks[i].getPriority() + "#"
                        + tasks[i].getDeadline() + "#"
                        + tasks[i].getDeadlinehr();
            }
        }

        return tmpTasksContent;
    }

    String[] getTaskContent() {
        String[] tmpTasksContent = new String[taskCount];
        for (int i = 0; i < taskCount; i++) {
            tmpTasksContent[i] = tasks[i].getTitle() + "#"
                    + tasks[i].getDescription() + "#"
                    + tasks[i].getPriority() + "#"
                    + tasks[i].getDeadline() + "#"
                    + tasks[i].getDeadlinehr();
        }
        return tmpTasksContent;
    }

    String getSpecificContent(int index, String what) {
        String value = null;
        if (what == "title") {
            value = tasks[index].getTitle();
        } else if (what == "description") {
            value = tasks[index].getDescription();
        } else if (what == "priority") {
            value = tasks[index].getPriority();
        } else if (what == "deadline") {
            value = tasks[index].getDeadline() +" "+ tasks[index].getDeadlinehr();
        }
        return value;
    }

    String[] getTaskValues(int index) {
        String[] values = new String[5];
        values[0] = tasks[index].getTitle();
        values[1] = tasks[index].getDescription();
        values[2] = tasks[index].getPriority();
        values[3] = tasks[index].getDeadline();
        values[4] = tasks[index].getDeadlinehr();
        return values;
    }

}
