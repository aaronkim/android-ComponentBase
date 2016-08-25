package com.infomark.robots.component.base.data.type.implement;

/**
 * Created by skkim on 8/25/16.
 */
 class BaseTypeImplement<T> extends BaseObject implements BaseTypeInterface<T> {

    private T mTypeValue = null;
    protected BaseTypeImplement() {

        set((T) null);
    }

    protected BaseTypeImplement(final T _value) {

        set(_value);
    }

    protected BaseTypeImplement(final BaseType<T> _baseType) {

        set(_baseType);
    }

    @Override
    public T get() {
        return mTypeValue;
    }

    @Override
    public void set(T _value) {
        mTypeValue = _value;
    }

    @Override
    public void set(BaseType<T> _baseType) {

        set(_baseType.get());
    }
}
