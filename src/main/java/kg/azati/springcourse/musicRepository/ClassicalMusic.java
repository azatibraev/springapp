package kg.azati.springcourse.musicRepository;

/**
 * @author AzatIbraev
 * @Date 09.05.2022
 */

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "a Classical Music";
    }
}
