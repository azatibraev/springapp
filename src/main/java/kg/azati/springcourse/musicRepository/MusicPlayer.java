package kg.azati.springcourse.musicRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AzatIbraev
 * @Date 09.05.2022
 */

public class MusicPlayer {

    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private double volume;

    public MusicPlayer() {}

    //todo IoC Инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

//    public void playMusic() {
//        System.out.println("Playing " + music.getSong());
//    }

    public void playList(Music music) {
        musicList.add(music);
    }

//    todo Внедрение через сеттеры
    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
