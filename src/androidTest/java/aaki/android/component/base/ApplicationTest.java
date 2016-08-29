package aaki.android.component.base;

import android.app.Application;
import android.test.ApplicationTestCase;

import aaki.android.component.base.data.type.BaseKeyValue;
import aaki.android.component.base.data.type.BaseValue;
import aaki.android.component.base.data.type.implement.BaseType;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
  public ApplicationTest() {
    super(Application.class);

    try {
      testType();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }



  public void testType() throws Exception {
    BaseKeyValue intData = new BaseKeyValue("intData", new BaseValue<>("1"));
    intData.getKey().get();
    intData.getValue().get();

    System.out.println();
    System.out.println("key = " + intData.getKey().get());
    System.out.println("value = " + intData.getValue().get());
    System.out.println();

    BaseType empty = BaseType.EMPTY;
    System.out.println(empty.get().toString());

  }
}