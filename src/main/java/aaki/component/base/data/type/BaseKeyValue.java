package aaki.component.base.data.type;

/**
 * Created by skkim on 8/25/16.
 */
public class BaseKeyValue {
    private BaseKey mKey    = null;
    private BaseValue mValue  = null;

    public BaseKeyValue(final BaseKeyValue _data) {
        this.mKey = _data.mKey;
        this.mValue = _data.mValue;
    }

    public BaseKeyValue(final BaseKey _key, final BaseValue _value) {
        this.mKey = _key;
        this.mValue = _value;
    }

    public BaseKeyValue(final String _keyValue, final BaseValue _value) {
        this.mKey = new BaseKey(_keyValue);
        this.mValue = _value;
    }


    public BaseKey getKey() {
        return this.mKey;
    }

    public BaseValue getValue() {
        return this.mValue;
    }

}
