package com.infomark.robots.component.base.data.type.implement;

import com.infomark.robots.component.base.BuildConfig;

class BaseObject extends Object {
    protected String TAG = getClass().getSimpleName();
    protected boolean DEBUG = BuildConfig.DEBUG;

    public BaseObject() {
        super();
    }
}
