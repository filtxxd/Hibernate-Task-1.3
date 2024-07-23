package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        // Создание таблицы User(ов)
        userService.createUsersTable();

        // Добавление 4 User(ов) в таблицу с данными на свой выбор
        userService.saveUser("Alice", "Schott", (byte) 30);
        System.out.println("User с именем – Alice добавлен в базу данных");

        userService.saveUser("Maria", "Schott", (byte) 25);
        System.out.println("User с именем – Maria добавлен в базу данных");

        userService.saveUser("Edward", "Linkeln", (byte) 35);
        System.out.println("User с именем – Edward добавлен в базу данных");

        userService.saveUser("Pitter", "Linkeln", (byte) 28);
        System.out.println("User с именем – Pitter добавлен в базу данных");

        // Получение всех User из базы и вывод в консоль
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}