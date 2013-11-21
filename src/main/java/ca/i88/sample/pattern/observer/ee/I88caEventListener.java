package ca.i88.sample.pattern.observer.ee;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

/**
 *
 * @author it.i88.ca
 */
@Stateless
public class I88caEventListener {

    public void listen(@Observes I88caEvent event) {
        System.out.println(event.getMsg());
    }

}
