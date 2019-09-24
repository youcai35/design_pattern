package com.gyc.creational;

/**
 * 描述：枚举类实现单例模式
 */
public enum EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("Print Test");
        }

    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
