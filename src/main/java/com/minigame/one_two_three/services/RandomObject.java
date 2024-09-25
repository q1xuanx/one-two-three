package com.minigame.one_two_three.services;

import com.minigame.one_two_three.models.Options;
import com.minigame.one_two_three.models.Results;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
// 0 = bua, 1 = keo, 2 = bao
// Hello toi se vao jenkins
public class RandomObject {
    public Results GetRandomResult(Options opt){
        Random rnd = new Random();
        int resOfRandom = rnd.nextInt(3);
        Results res = new Results();
        if (opt.timesPlay == 3){
            if (opt.chose == 0){
                res.setUserChose(opt.chose);
                res.setBotChose(2);
                res.setWinners("BOT");
            }else if (opt.chose == 1){
                res.setUserChose(opt.chose);
                res.setBotChose(0);
                res.setWinners("BOT");
            }else {
                res.setUserChose(opt.chose);
                res.setBotChose(1);
                res.setWinners("BOT");
            }
            return res;
        }
        int userOrBot = resOfRandom - opt.chose;
        if (userOrBot == -1 || userOrBot == 2){
            res.setUserChose(opt.chose);
            res.setBotChose(resOfRandom);
            res.setWinners("BOT");
        }else if (userOrBot != 0){
            res.setBotChose(resOfRandom);
            res.setUserChose(opt.chose);
            res.setWinners("USER");
        }else {
            res.setBotChose(resOfRandom);
            res.setUserChose(opt.chose);
            res.setWinners("DRAW");
        }
        return res;
    }

}



