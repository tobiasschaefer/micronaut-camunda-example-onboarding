package onboarding;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class CreateCustomer implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(CreateCustomer.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.warn("Creating customer {} {}", execution.getBusinessKey(), execution.getVariable("result"));
    }
}
