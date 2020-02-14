package com.adolph.templatemethod;

public abstract class PutThingIntoFrigCourse {

    protected final void createCourse() {
        //是否需要对大块的东西进行切割
        if (needCut()) {
            this.cut();
        }
        //打开冰箱门
        this.openDoor();
        //把东西放进去
        this.putThingIntoFrig();
        //关闭冰箱门
        this.closeDoor();
    }

    //钩子方法：对步骤进行微调
    protected boolean needCut() {
        return false;
    }

    //钩子方法：就是通过返回值对模板类内部进行修改
    abstract String thing();

    final void cut() {
        System.out.println("切碎" + thing());
    }

    final void openDoor() {
        System.out.println("打开冰箱门");
    }

    final void putThingIntoFrig() {
        System.out.println("把" + thing() + "放冰箱");
    }

    final void closeDoor() {
        System.out.println("关闭冰箱门");
    }
}