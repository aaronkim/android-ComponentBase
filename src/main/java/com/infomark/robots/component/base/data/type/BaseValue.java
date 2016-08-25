package com.infomark.robots.component.base.data.type;

import android.util.Log;

import com.infomark.robots.component.base.data.type.implement.BaseType;

/**
 * Created by skkim on 8/25/16.
 */
public class BaseValue<T> extends BaseType<T> {

    public BaseValue() {
        super();
    }

    public BaseValue(final T _value) {
        super(_value);
        if(DEBUG) Log.d(TAG, "crete value = " + _value);
    }

    public BaseValue(final BaseValue _baseType) {
        super(_baseType);
        if(DEBUG) Log.d(TAG, "crete value = " + _baseType.get());
    }
}
