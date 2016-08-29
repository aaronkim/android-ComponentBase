package aaki.android.component.base.data.type.implement;

/**
 * Created by skkim on 8/25/16.
 */
interface BaseTypeInterface<T> {

    public T get();

    public void set(T _value);

    public void set(BaseType<T> _baseType);
}
