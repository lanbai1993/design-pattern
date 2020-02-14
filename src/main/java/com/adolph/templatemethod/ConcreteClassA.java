package com.adolph.templatemethod;

/**
 * @author xiewei
 * @since 2020/2/14 13:37
 */
public class ConcreteClassA extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体方法A方法1实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体方法A方法2实现");
    }
}
