import java.util.ArrayList;
import java.util.Scanner;
public class TaskManajer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> task = new ArrayList<String>();
        //вывод доступных команд
        System.out.println("Доступные команды: add, remove, done, exit");
        while (true) {
            //вывод списка задач
            System.out.println("\n Список задач:");
            for (int j = 0; j <task.size(); j++) {
                System.out.println((j+1) + ". " + task.get(j));
            }
            //ввод команды
            System.out.println("\n Введите команду: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                //добавление задачи
                System.out.println("Введите новую задачу: ");
                String newTask = scanner.nextLine();
                task.add(newTask);
            } else if (command.equals("remove")){
                //удаление задачи
                System.out.println("Введите номер задачи для удаления: ");
                int index = Integer.parseInt(scanner.nextLine());
                task.remove(index - 1);
            } else if (command.equals("done")) {
                //отметка задачи как выполненной
                System.out.println("Введите номер задачи, которую нужно отметить как выполненную: ");
                int index = Integer.parseInt(scanner.nextLine());
                task.set(index - 1, task.get(index - 1) + "(выполнено)");
            } else if (command.equals("exit")) {
                //выход из программы
                break;
            } else {
                //не корректная команда
                System.out.println("Некорректная команда. Повторите ввод.");

            }

        }


    }
}
