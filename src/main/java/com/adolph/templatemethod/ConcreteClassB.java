package com.adolph.templatemethod;

/**
 * @author xiewei
 * @since 2020/2/14 13:38
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void PrimitiveOperation1() {
        System.out.println("具体方法B方法1实现");
    }

    @Override
    public void PrimitiveOperation2() {
        System.out.println("具体方法B方法2实现");
    }
}
