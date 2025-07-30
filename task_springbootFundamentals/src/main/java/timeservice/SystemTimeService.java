package timeservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
@Primary
public class SystemTimeService implements TimeService
{
    @Override
    public String getTime()
    {
        return "System Time: " + LocalDateTime.now();
    }
}
