package koschei.models;

/***
 * Bean island2 определён в конфигурационном файле приложения.
 * Внедрение зависимости через конструктор (@Autowired не требуется указывать)
 */
public class Island2 {

    private final Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood;
    }
}
