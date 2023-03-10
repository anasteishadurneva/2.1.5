package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * Внедрение зависимости через поле класса
 */
@Component
public class Duck5 {

    @Autowired
    private Egg6 egg;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg;
    }
}