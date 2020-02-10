package com.adolph.singleton;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.ImmutableMap;

import java.io.File;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 枚举单例2
 *
 * @since 2020-02-08
 */
public class EnumSingleton2 {

    private EnumSingleton2(){}

    private enum InnerEnum{
        INSTANCE;

        private final EnumSingleton2 instance;

        InnerEnum(){
            instance = new EnumSingleton2();
        }

        public EnumSingleton2 getInstance(){
            return instance;
        }
    }

    public static EnumSingleton2 getInstance(){
        return InnerEnum.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(1,100).forEach(i->new Thread(String.valueOf(i)){
            @Override
            public void run() {
                System.out.println(EnumSingleton2.getInstance());
            }
        }.start());
    }
}
