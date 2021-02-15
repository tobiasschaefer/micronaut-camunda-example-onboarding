package onboarding;

import jakarta.inject.Singleton;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class CreateCustomer implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(CreateCustomer.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.warn("Creating customer {} with result {}", execution.getBusinessKey(), execution.getVariable("result"));
    }
}
