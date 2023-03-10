package koschei;

import koschei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
        String testText = koscheiTheDeathless.getRulesByDeth();
        if (!testText.contains("На свете есть океан") && testText.length() <= testText.length()) {
            System.out.println("Тест провален, не корректная связь бинов. Итоговая фраза не верна.");
        }
    }
}
