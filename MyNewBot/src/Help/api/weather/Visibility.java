package Help.api.weather;
import lombok.Data;

@Data
public class Visibility {
    private final int value;

    public Visibility(int value) {
        this.value = value;
    }
}

