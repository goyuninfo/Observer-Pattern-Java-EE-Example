package info.goyun.sample.pattern.observer.ee;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

/**
 *
 * @author it.i88.ca
 */
@Stateless
public class GoyunInfoEventListener {

    public void listen(@Observes GoyunInfoEvent event) {
        System.out.println(event.getMsg());
    }

}
