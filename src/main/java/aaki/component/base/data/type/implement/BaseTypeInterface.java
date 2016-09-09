package aaki.component.base.data.type.implement;

/**
 * Created by skkim on 8/25/16.
 */
interface BaseDataTypeInterface<T> {

    public T get();

    public void set(T _value);

    public void set(BaseDataType<T> _baseType);
}
