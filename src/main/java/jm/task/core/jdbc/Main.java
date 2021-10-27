package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        System.out.println("User с именем " + userService.getAllUsers().get(0).getName() + " добавлен в базу данных");
        userService.saveUser("Stepan", "Sidorov", (byte) 30);
        System.out.println("User с именем " + userService.getAllUsers().get(1).getName() + " добавлен в базу данных");
        userService.saveUser("Elena", "Nabatnikova", (byte) 38);
        System.out.println("User с именем " + userService.getAllUsers().get(2).getName() + " добавлен в базу данных");
        userService.saveUser("Steve", "Bushemi", (byte) 63);
        System.out.println("User с именем " + userService.getAllUsers().get(3).getName() + " добавлен в базу данных");

        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }


}
