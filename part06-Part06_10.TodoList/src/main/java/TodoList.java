
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Genys.D
 */
public class TodoList {

    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();

    }

    public void add(String task) {
        todoList.add(task);
    }

    public void print() {
        for (int i = 0; i < this.todoList.size(); i++) {
            System.out.println((i + 1) + ": " + this.todoList.get(i));
        }
    }

    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index >= this.todoList.size()) {
            return;
        }

        this.todoList.remove(index);
    }

}
