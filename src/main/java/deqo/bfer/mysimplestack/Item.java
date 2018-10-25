package deqo.bfer.mysimplestack;

public class Item {
    private int value;

    public Item () {
        this.value = 0;
    }

    public Item (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

    public void setValue (int value) {
        this.value = value;
    }
}
