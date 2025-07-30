package timeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController
{
    private final TimeService systemTimeService;
    private final TimeService mockTimeService;

    @Autowired
    public TimeController(TimeService systemTimeService, @Qualifier("mock") TimeService mockTimeService)
    {
        this.systemTimeService = systemTimeService;
        this.mockTimeService = mockTimeService;
    }

    @GetMapping("/systime")
    public String getSystemTime()
    {
        return systemTimeService.getTime();
    }

    @GetMapping("/mocktime")
    public String getMockTime()
    {
        return mockTimeService.getTime();
    }
}
