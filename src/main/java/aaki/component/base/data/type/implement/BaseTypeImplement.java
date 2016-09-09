package aaki.component.base.data.type.implement;

/**
 * Created by skkim on 8/25/16.
 */
 class BaseDataTypeImplement<T> extends BaseObject implements BaseDataTypeInterface<T> {

    private T mTypeValue = null;
    protected BaseDataTypeImplement() {

        set((T) null);
    }

    protected BaseDataTypeImplement(final T _value) {

        set(_value);
    }

    protected BaseDataTypeImplement(final BaseDataType<T> _baseType) {

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
    public void set(BaseDataType<T> _baseType) {

        set(_baseType.get());
    }
}
