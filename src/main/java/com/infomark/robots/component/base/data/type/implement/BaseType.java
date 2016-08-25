package com.infomark.robots.component.base.data.type.implement;

/**
 * Created by skkim on 8/25/16.
 */
public class BaseType<T> extends BaseTypeImplement<T> {
    public static final BaseType<BaseObject> EMPTY = new BaseType<>(new BaseObject());
    private T mTypeValue = null;

    public BaseType() {
        super();
    }

    public BaseType(final T _value) {
        super(_value);
    }

    public BaseType(final BaseType<T> _baseType) {
        super(_baseType);
    }
}
