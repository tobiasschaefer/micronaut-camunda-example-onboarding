package onboarding;

import jakarta.inject.Singleton;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class ScoreCustomer implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(ScoreCustomer.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.warn("Scoring {}...", execution.getBusinessKey());
        execution.setVariable("result", (int)(Math.random()*100));
    }
}
