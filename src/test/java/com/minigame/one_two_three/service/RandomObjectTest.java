package com.minigame.one_two_three.service;
import com.minigame.one_two_three.models.Options;
import com.minigame.one_two_three.models.Results;
import com.minigame.one_two_three.services.RandomObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class RandomObjectTest {
    @InjectMocks
    RandomObject randomObject;
    //InjectMock neu repo service co ke thua jpa
    //Test webhook config
    @Test
    public void testRandomResult_IfUserChose0AndTimesplayEquals3_ReturnBot(){
        Options options = new Options();
        //Test case 1
        // user chose 0
        options.setTimesPlay(3);
        options.setChose(0);
        Results res1 = randomObject.GetRandomResult(options);
        assertEquals(0, res1.getUserChose());
        assertEquals(2, res1.getBotChose());
        assertEquals("BOT", res1.getWinners());
    }
    @Test
    public void testRandomResult_IfUserChose1AndTimesplayEquals3_ReturnBot(){
        Options options = new Options();
        options.setTimesPlay(3);
        options.setChose(1);
        Results res2 = randomObject.GetRandomResult(options);
        assertEquals(1, res2.getUserChose());
        assertEquals(0, res2.getBotChose());
        assertEquals("BOT", res2.getWinners());
    }
    @Test
    public void testRandomResult_IfUserChose2AndTimesplayEquals3_ReturnBot(){
        Options options = new Options();
        options.setTimesPlay(3);
        options.setChose(2);
        Results res3 = randomObject.GetRandomResult(options);
        assertEquals(2, res3.getUserChose());
        assertEquals(1, res3.getBotChose());
        assertEquals("BOT", res3.getWinners());
    }
}