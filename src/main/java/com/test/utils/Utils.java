package com.test.utils;

import java.util.Random;

public class Utils {
    public static int getRandomNum(int start, int end){
        //产生随机数
        return new Random().nextInt(end - start + 1) + start;

    }
}
