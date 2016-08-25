package com.infomark.robots.component.base.data.type;

import com.infomark.robots.component.base.data.type.implement.BaseType;

/**
 * Created by skkim on 8/25/16.
 */
public class BaseKey extends BaseType<String> {

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
