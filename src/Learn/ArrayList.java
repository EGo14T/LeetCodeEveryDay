package Learn;

import org.junit.Test;

import java.util.List;

public class ArrayList {
    

    @Test
    public void test(){
        Music music = new Music();
        music.setId(1);
        music.setName("jack");
        music.setId(2);
        music.setName("bob");
        List<Music> musics = new java.util.ArrayList<>();

        musics.add(music);


        System.out.printf(musics.get(0).getName());
    }
}
