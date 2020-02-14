package com.adolph.templatemethod;

/**
 * @author xiewei
 * @since 2020/2/14 13:36
 */
public abstract class AbstractClass {

    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    protected final void TemplateMethod() {
        PrimitiveOperation1();
        PrimitiveOperation2();
    }
}
