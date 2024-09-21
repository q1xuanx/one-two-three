package com.minigame.one_two_three.models;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Options {
    public int chose;
    public int timesPlay = 1;
}
