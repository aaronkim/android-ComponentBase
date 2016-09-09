package aaki.android.component.base.test;

import aaki.component.base.data.type.BaseKey;
import aaki.component.base.data.type.BaseKeyValue;
import aaki.component.base.data.type.BaseValue;
import aaki.component.base.data.type.implement.BaseDataType;

/**
 * Created by skkim on 8/25/16.
 */
public class test {
    public static void main(String args[]) {

        Object obj = new Object();
        BaseKey baseKey = obj instanceof BaseKey ? ((BaseKey) obj) : null;
        if (obj == null) {

        }

        // 옵션 개수 검사. 옵션 없으면 에러 메시지 출력하고 종료
        if (args.length == 0) {
            System.err.println("옵션을 입력하세요");
            System.exit(1);
        }

        // 옵션 개수 출력
        System.out.println("모두 " + args.length + "개의 옵션을 입력하셨군요.");

        System.out.println(); // 줄바꿈


//        // 모든 옵션 하나씩 화면에 출력
//        for (int i = 0; i < args.length; i++)
//            System.out.format("args[%d] : %s%n", i, args[i]);

        try {
            testType();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void testType() throws Exception {
        BaseKeyValue intData = new BaseKeyValue("intData", new BaseValue<>("1"));
        intData.getKey().get();
        intData.getValue().get();

        System.out.println();
        System.out.println("key = " + intData.getKey().get());
        System.out.println("value = " + intData.getValue().get());
        System.out.println();

        BaseDataType empty = BaseDataType.EMPTY;
        System.out.println(empty.get().toString());
    }
}
