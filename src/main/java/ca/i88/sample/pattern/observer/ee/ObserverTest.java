package ca.i88.sample.pattern.observer.ee;

import java.util.Date;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author it.i88.ca
 */
@Named
public class ObserverTest {

    @Inject
    Event<I88caEvent> event;

    public void fire() {
        event.fire(new I88caEvent("event fired at: " + new Date()));
    }

}
