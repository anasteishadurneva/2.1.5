package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * Внедрение зависимости через конструктор
 */
@Component
public class Needle7 {
    private Deth8 death;

    @Autowired
    public void setDeath(Deth8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + death;
    }
}