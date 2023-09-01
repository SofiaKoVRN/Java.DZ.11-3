package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void simpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        TodosManager todos = new TodosManager();

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void simpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        TodosManager todos = new TodosManager();

        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleEpicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Молоко");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleEpicNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Вода");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleMeetingMatchesTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleMeetingMatchesProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение НетоБанка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void simpleMeetingNotMatches() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual= meeting.matches("Во вторник после обеда");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnIdInTask() {
        Task task = new Task(55);

        int expected = 55;
        int actual = task.getId();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void returnTrueOrFalseInEquals() {
//        Task task = new Task(5);
//
//        boolean actual = task.equals(false);
//        boolean expected = false;
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    public void returnFalseInMatches() {
//        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
//
//        String actual = simpleTask.getTitle("Позвонить родителям");
//        String expected = "Позвонить родителям";
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    public void returnSubtasks() {
//        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
//        Epic epic = new Epic(55, subtasks);
//
//        String[] actual = epic.getSubtasks("Молоко");
//        String expected = "Молоко";
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test

}