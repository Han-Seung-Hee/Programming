import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Gigasecond {
    long gigaSecond = 1_000_000_000L;
    private final LocalDateTime localDateTime;
    
    //this(DataType)으로 기존에 선언 된 다른 생성자 이용 가능. 요게 핵심임.
    public Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.localDateTime = moment;
    }

    //TemporalUnit 에 대한 이해 필요.
    public LocalDateTime getDateTime() {
        return localDateTime.plus(gigaSecond,ChronoUnit.SECONDS);
    }
}
