package NonCommand;
import com.app.settings.Settings;
import java.time.DateTimeException;
public abstract class SetTimeDateZoneCommand {
    private final static String SUCCESS_MESSAGE_RU = "Прекрасно! Ваш часовой пояс установлен!";
    private final static String FAILURE_MESSAGE_RU = "Что-то пошло не так. " +
            "Проверьте введёное время на соответствие формату";

    public static String setZonedDateTime(Settings settings, String currentTime) {
        try {
            String[] time = currentTime.split(":");
            time[0] = time[0].equals("00") ? "24" : time[0];
            time[1] = time[1].equals("00") ? "24" : time[0];
            int offsetHour = settings.getZonedDateTime().getHour() - Integer.parseInt(time[0]);
            settings.setZonedDateTime(offsetHour);
        } catch (NumberFormatException | DateTimeException e) {
            return FAILURE_MESSAGE_RU;
        }
        return SUCCESS_MESSAGE_RU;
    }
}

