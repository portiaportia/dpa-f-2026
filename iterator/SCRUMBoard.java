package iterator;

public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList("ToDo");
        this.doing = new TaskList("Doing");
        this.done = new TaskList("Done");
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        todo.addTicket(name, teamMember, difficulty);
    }

    public boolean startTicket(String name) {
        return moveTicket(name, todo, doing);
    }

    public boolean finishTicket(String name) {
        return moveTicket(name, doing, done);
    }

    private boolean moveTicket(String name, TaskList oldList, TaskList newList) {
        Ticket ticket = oldList.getTicket(name);

        if (ticket == null) {
            return false;
        }

        newList.addTicket(ticket);
        return true;
    }

    public String toString() {
        String result = "***** " + projectName + "******\n";

        result += todo.toString() + doing.toString() + done.toString();

        return result;
    }
}
