package javaoop4.src;
public class JsonWritter implements Format {
    @Override
    public <T extends Task> String createString(T task) {
        return String.format("""
                {
                "id" : %d, {
                "Task":%s,
                "author":"%s",
                "adding time":"%s"
                "adding date":"%s"
                "deadline":"%s"
                "priority":"%s"
                }
                }
                """, task.getId(), task.getSubject(), task.getAuthor(), task.getAddTime(), task.getAddDate(), task.getEndOfTask(), task.getPriority());
    }
}