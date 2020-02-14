package com.adolph.templatemethod;

/**
 * @author xiewei
 * @since 2020/2/14 13:39
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass;

        abstractClass = new ConcreteClassA();
        abstractClass.TemplateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.TemplateMethod();
    }
}
