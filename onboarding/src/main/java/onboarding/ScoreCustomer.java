package onboarding;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class ScoreCustomer implements JavaDelegate {

    private static final Logger log = LoggerFactory.getLogger(ScoreCustomer.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.warn("Scoring...");
        execution.setVariable("result", (int)(Math.random()*100));
    }
}
