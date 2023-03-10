package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * Внедрение зависимости через поле класса
 */
@Component
public class Rabbit4 {

        @Autowired
        private Duck5 duck;

        @Override
        public String toString() {
                return ", в зайце утка " + duck.toString();
        }
}
