package kz.bitlab.techorda.db;

import java.util.ArrayList;
public class DBManager {
    static ArrayList<Tasks> tasks = new ArrayList<>();

    static {
        tasks.add(new Tasks(1L,
                "Домашняя работа",
                "Не сделаю домашку по физике до вечера, мама убьет",
                "2023-04-13", false)
        );

        tasks.add(new Tasks(2L,
                "Битлаб Спринттаск",
                "Надо быстрее закончить спринт по ДжаваЕЕ, осталось только доделать addTask",
                "2023-04-13", false)
        );

        tasks.add(new Tasks(3L,
                "Дочитать книгу",
                "Гарри Поттер Роулинга",
                "2023-05-01", false)
        );

        tasks.add(new Tasks(4L,
                "Доделать презентацию по казахскому",
                "Как может твоя профессия помочь развить казахсикй язык",
                "2023-04-15", false)
        );
    }

    static long id = tasks.size();

    public static void addTask(Tasks task) {
        task.setId(++id);
        tasks.add(task);
    }

    public static Tasks getTask(Long id) {
        for (Tasks t : tasks) {
            if (t.getId() == id) return t;
        }
        return null;
    }

    public static ArrayList <Tasks> getAllTasks() {
        return tasks;
    }

    public static void deleteTask(Long id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                break;
            }
        }
    }
    public static void saveTask(Tasks task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.get(i).setName(task.getName());
                tasks.get(i).setDescription(task.getDescription());
                tasks.get(i).setDeadlineDate(task.getDeadlineDate());
                tasks.get(i).setStatus(task.getStatus());

            }

        }
    }
}
