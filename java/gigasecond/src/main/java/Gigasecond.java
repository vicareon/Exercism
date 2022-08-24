import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Gigasecond {
    private final LocalDateTime time;
    public Gigasecond(LocalDate moment) {
        this.time = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.time = moment;
    }

    public LocalDateTime getDateTime() {
        return this.time.plusSeconds(1000000000);
    }
}