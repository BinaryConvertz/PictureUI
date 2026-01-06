import java.util.Locale;

public class UppercasePointer {

    public String Name = "";


    public UppercasePointer(String box) {
        this.Name = box;
    }

    public String Names() {
        return this.Name.toUpperCase(Locale.ROOT);
    }

}
