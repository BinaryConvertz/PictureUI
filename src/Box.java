import java.util.Locale;

public class Box {

    public String Name = "";


    public Box(String box) {
        this.Name = box;
    }

    public String Names() {
        return this.Name.toUpperCase(Locale.ROOT);
    }

}
