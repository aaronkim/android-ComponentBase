package aaki.component.base.data.type;

import aaki.component.base.data.type.implement.BaseDataType;

/**
 * Created by skkim on 8/25/16.
 */
public class BaseKey extends BaseDataType<String> {

    public BaseKey() {
        super();
    }

    public BaseKey(final String keyValue) {
        super(keyValue);
    }

    public BaseKey(final BaseKey _baseType) {
        super(_baseType);
    }
}
