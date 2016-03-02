package AbstractClasses.Challenge;

public abstract class ListItem {
    Object value;
    ListItem previous;
    ListItem next;

    public ListItem(Object value) {
        this.value = value;
    }
}
