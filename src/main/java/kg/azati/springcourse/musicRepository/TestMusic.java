package kg.azati.springcourse.musicRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AzatIbraev
 * @Date 09.05.2022
 */

public class TestMusic {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //todo With constructor
//         Music music = applicationContext.getBean("musicBean",  Music.class);
//         MusicPlayer musicPlayer = new MusicPlayer(music);

        //todo Ссылка на бин
//       todo Dependency Injection
        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
//         musicPlayer.playMusic();


//         todo added value to setter
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
    }
}
