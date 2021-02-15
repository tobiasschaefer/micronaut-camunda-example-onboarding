package onboarding;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import org.camunda.bpm.engine.RuntimeService;

import javax.inject.Singleton;

@Singleton
public class ProcessInstanceCreator implements ApplicationEventListener<StartupEvent> {

    private final RuntimeService runtimeService;

    public ProcessInstanceCreator(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Override
    public void onApplicationEvent(StartupEvent event) {
        runtimeService.startProcessInstanceByKey("Onboarding", "OnStartup");
    }
}
