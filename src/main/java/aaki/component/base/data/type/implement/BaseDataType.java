package aaki.component.base.data.type.implement;

/**
 * Created by skkim on 8/25/16.
 */
public class BaseDataType<T> extends BaseDataTypeImplement<T> {
    public static final BaseDataType<BaseObject> EMPTY = new BaseDataType<>(new BaseObject());
    private T mTypeValue = null;

    public BaseDataType() {
        super();
    }

    public BaseDataType(final T _value) {
        super(_value);
    }

    public BaseDataType(final BaseDataType<T> _baseType) {
        super(_baseType);
    }
}
