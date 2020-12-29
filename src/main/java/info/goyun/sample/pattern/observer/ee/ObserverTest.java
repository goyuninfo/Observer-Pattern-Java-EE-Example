package info.goyun.sample.pattern.observer.ee;

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
    Event<GoyunInfoEvent> event;

    public void fire() {
        event.fire(new GoyunInfoEvent("event fired at: " + new Date()));
    }

}
