package com.minigame.one_two_three.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Results {
    int userChose;
    int botChose;
    String winners;
}
