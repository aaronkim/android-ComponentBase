package aaki.component.base.data.type.implement;

import aaki.android.component.base.BuildConfig;

class BaseObject extends Object {
    protected String TAG = getClass().getSimpleName();
    protected boolean DEBUG = BuildConfig.DEBUG;

    public BaseObject() {
        super();
    }
}
