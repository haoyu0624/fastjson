/*
 * Copyright 2018 Diffblue Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.alibaba.fastjson;

import com.alibaba.fastjson.JSONPath;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class JSONPathTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: JSONPath */

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 2547 branch to line 2551
   *  - conditional line 2551 branch to line 2551
   *  - conditional line 2551 branch to line 2552
   */
  @Test
  public void eq1() throws Throwable {
    // Arrange
    Object a = -1;
    Object b = null;
    // Act
    Class<?> c = Reflector.forName("com.alibaba.fastjson.JSONPath");
    Method m = c.getDeclaredMethod("eq", Reflector.forName("java.lang.Object"), Reflector.forName("java.lang.Object"));
    m.setAccessible(true);
    boolean retval = (Boolean)m.invoke(null, a, b);
    System.out.println("retval = " + retval);
    // Assert result
    Assert.assertEquals(false, retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 2547 branch to line 2548
   */
  @Test
  public void eq2() throws Throwable {
    // Arrange
    Object a = null;
    Object b = null;
    // Act
    Class<?> c = Reflector.forName("com.alibaba.fastjson.JSONPath");
    Method m = c.getDeclaredMethod("eq", Reflector.forName("java.lang.Object"), Reflector.forName("java.lang.Object"));
    m.setAccessible(true);
    boolean retval = (Boolean)m.invoke(null, a, b);
    // Assert result
    Assert.assertEquals(true, retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 1434 branch to line 1434
   */
  @Test
  public void isDigitFirst1() throws Throwable {
    // Arrange
    char ch = '2';
    // Act
    Class<?> c = Reflector.forName("com.alibaba.fastjson.JSONPath$JSONPathParser");
    Method m = c.getDeclaredMethod("isDigitFirst", Reflector.forName("char"));
    m.setAccessible(true);
    boolean retval = (Boolean)m.invoke(null, ch);
    // Assert result
    Assert.assertEquals(true, retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 1434 branch to line 1434
   */
  @Test
  public void isDigitFirst2() throws Throwable {
    // Arrange
    char ch = ':';
    // Act
    Class<?> c = Reflector.forName("com.alibaba.fastjson.JSONPath$JSONPathParser");
    Method m = c.getDeclaredMethod("isDigitFirst", Reflector.forName("char"));
    m.setAccessible(true);
    boolean retval = (Boolean)m.invoke(null, ch);
    // Assert result
    Assert.assertEquals(false, retval);
  }

   /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 1434 branch to line 1434
   */
  @Test
  public void isDigitFirst3() throws Throwable {
    // Arrange
    char ch = '\u0000';
    // Act
    Class<?> c = Reflector.forName("com.alibaba.fastjson.JSONPath$JSONPathParser");
    Method m = c.getDeclaredMethod("isDigitFirst", Reflector.forName("char"));
    m.setAccessible(true);
    boolean retval = (Boolean)m.invoke(null, ch);
    // Assert result
    Assert.assertEquals(false, retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 674 branch to line 674
   */
  @Test
  public void isEOF1() throws Throwable {
    // Arrange
    Object objectUnderTest = Reflector.getInstance("com.alibaba.fastjson.JSONPath$JSONPathParser");
    Reflector.setField(objectUnderTest, "path", "");
    Reflector.setField(objectUnderTest, "pos", -2147483647);
    Reflector.setField(objectUnderTest, "level", 0);
    Reflector.setField(objectUnderTest, "ch", '\u0000');
    // Act
    Class<?> c = Reflector.forName("com.alibaba.fastjson.JSONPath$JSONPathParser");
    Method m = c.getDeclaredMethod("isEOF");
    m.setAccessible(true);
    boolean retval = (Boolean)m.invoke(objectUnderTest);
    // Assert result
    Assert.assertEquals(false, retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 674 branch to line 674
   */
  @Test
  public void isEOF2() throws Throwable {
    // Arrange
    Object objectUnderTest = Reflector.getInstance("com.alibaba.fastjson.JSONPath$JSONPathParser");
    Reflector.setField(objectUnderTest, "path", "!");
    Reflector.setField(objectUnderTest, "pos", 1);
    Reflector.setField(objectUnderTest, "level", 0);
    Reflector.setField(objectUnderTest, "ch", '\u0000');
    // Act
    Class<?> c = Reflector.forName("com.alibaba.fastjson.JSONPath$JSONPathParser");
    Method m = c.getDeclaredMethod("isEOF");
    m.setAccessible(true);
    boolean retval = (Boolean)m.invoke(objectUnderTest);
    // Assert result
    Assert.assertEquals(true, retval);
  }
}
