package timeservice;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("mock")
public class MockTimeService implements TimeService
{
    @Override
    public String getTime()
    {
        return "Mock Time Service: 2024-02-01 09:00:00";
    }
}
