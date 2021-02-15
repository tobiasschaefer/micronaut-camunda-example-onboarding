package onboarding;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import org.camunda.bpm.engine.RuntimeService;

@Controller
public class MessageController {

    private final RuntimeService runtimeService;

    public MessageController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Post("/cancel/{businessKey}")
    public String customerCancels(@PathVariable String businessKey) {
        runtimeService.correlateMessage("MessageCustomerCancellation", businessKey);
        return "cancelled " + businessKey;
    }
}
