/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 22 06:32:32 GMT 2020
 */

package generated;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import sg.edu.nus.comp.cs4218.Environment;
import sg.edu.nus.comp.cs4218.exception.GrepException;
import sg.edu.nus.comp.cs4218.impl.app.GrepApplication;

import java.io.*;
import java.util.Enumeration;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class GrepApplication_ESTest extends GrepApplication_ESTest_scaffolding {


  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = Boolean.valueOf("");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = new String[7];
      stringArray0[0] = "This is a directory";
      stringArray0[1] = "Pattern should not be empty.";
      stringArray0[2] = "This is a directory";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = ".";
      stringArray0[6] = ".";
      String string0 = grepApplication0.grepFromFiles(".", boolean0, boolean0, stringArray0);
      assertEquals(7, stringArray0.length);
      assertEquals("This is a directory: No such file or directory\nPattern should not be empty.: No such file or directory\nThis is a directory: No such file or directory\n: No such file or directory\n: No such file or directory\n.: This is a directory\n.: This is a directory\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = Boolean.TRUE;
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      Boolean boolean1 = null;
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-772), 0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      byteArrayInputStream0.reset();
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertArrayEquals(new byte[] {}, byteArray0);
      
      try { 
        grepApplication0.grepFromStdin("s+", boolean0, (Boolean) null, byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }


  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String[] stringArray0 = new String[1];
      stringArray0[0] = "This is a directory";
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Pattern should not be empty.");
      assertNotNull(mockFileOutputStream0);
      
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 1);
      assertNotNull(bufferedOutputStream0);
      
      // Undeclared exception!
      try { 
        grepApplication0.run(stringArray0, pipedInputStream0, bufferedOutputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable cannot be cast to sg.edu.nus.comp.cs4218.exception.GrepException
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = Boolean.valueOf(true);
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = null;
      try { 
        grepApplication0.grepFromFiles("", boolean0, boolean0, (String[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = Boolean.valueOf(true);
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Pattern should not be empty.";
      stringArray0[1] = "Null Pointer Exception";
      try { 
        grepApplication0.grepFromFiles("", (Boolean) null, boolean0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = new Boolean("Pattern should not be empty.");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = new String[0];
      try { 
        grepApplication0.grepFromFiles("", (Boolean) null, boolean0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "This is a directory";
      stringArray0[1] = "Null Pointer Exception";
      stringArray0[2] = "Invalid pattern syntax";
      stringArray0[3] = "Invalid pattern syntax";
      stringArray0[4] = "This is a directory";
      stringArray0[5] = "";
      stringArray0[6] = "This is a directory";
      stringArray0[7] = "Pattern should not be empty.";
      Enumeration<MockFileInputStream> enumeration0 = (Enumeration<MockFileInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      assertNotNull(sequenceInputStream0);
      
      sequenceInputStream0.close();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Pattern should not be empty.");
      assertNotNull(mockPrintStream0);
      
      byte[] byteArray0 = new byte[1];
      mockPrintStream0.write(byteArray0, 2734, 42);
      assertEquals(1, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      byteArray0[0] = (byte) (-119);
      int int0 = sequenceInputStream0.read(byteArray0);
      assertEquals(1, byteArray0.length);
      assertEquals((-1), int0);
      assertArrayEquals(new byte[] {(byte) (-119)}, byteArray0);
      
      mockPrintStream0.print('L');
      boolean boolean0 = sequenceInputStream0.markSupported();
      assertFalse(boolean0);
      
      grepApplication0.run(stringArray0, sequenceInputStream0, mockPrintStream0);
      assertEquals(8, stringArray0.length);
      
      grepApplication0.run(stringArray0, sequenceInputStream0, mockPrintStream0);
      assertEquals(8, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = Boolean.FALSE;
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      Boolean boolean1 = new Boolean("dwZ) ],^]ii2.tLF");
      assertFalse(boolean1);
      assertTrue(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String string0 = grepApplication0.grepFromStdin("nlFX096", boolean0, boolean1, byteArrayInputStream0);
      assertEquals(0, byteArray0.length);
      assertEquals("", string0);
      assertTrue(boolean0.equals((Object)boolean1));
      assertTrue(boolean1.equals((Object)boolean0));
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(string0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Pattern should not be empty.";
      stringArray0[1] = "This is a directory";
      stringArray0[2] = "Null Pointer Exception";
      MockPrintStream mockPrintStream0 = new MockPrintStream("Null Pointer Exception");
      assertNotNull(mockPrintStream0);
      
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "Invalid pattern syntax");
      assertSame(mockPrintStream0, printStream0);
      assertSame(printStream0, mockPrintStream0);
      assertNotNull(printStream0);
      
      grepApplication0.run(stringArray0, byteArrayInputStream0, printStream0);
      assertSame(mockPrintStream0, printStream0);
      assertSame(printStream0, mockPrintStream0);
      assertEquals(0, byteArray0.length);
      assertEquals(3, stringArray0.length);
      assertEquals(0, byteArrayInputStream0.available());
      assertArrayEquals(new byte[] {}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "No such file or directory";
      stringArray0[1] = "Pattern should not be empty.";
      stringArray0[2] = "This is a directory";
      stringArray0[3] = "Invalid pattern syntax";
      stringArray0[4] = "This is a directory";
      stringArray0[5] = "";
      stringArray0[6] = "Null Pointer Exception";
      stringArray0[7] = "Null Pointer Exception";
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      MockPrintStream mockPrintStream0 = new MockPrintStream("Null Pointer Exception");
      assertNotNull(mockPrintStream0);
      
      grepApplication0.run(stringArray0, pipedInputStream0, mockPrintStream0);
      assertEquals(8, stringArray0.length);
      assertEquals(0, pipedInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String string0 = "xb";
      Boolean boolean0 = Boolean.valueOf(false);
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      Boolean boolean1 = Boolean.TRUE;
      assertTrue(boolean1);
      assertFalse(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      PipedInputStream pipedInputStream0 = new PipedInputStream(3346);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(bufferedInputStream0);
      
      try { 
        grepApplication0.grepFromStdin("xb", boolean0, boolean1, bufferedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String string0 = "t+WbM_e?-)|";
      Boolean boolean0 = Boolean.TRUE;
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      String[] stringArray0 = new String[8];
      stringArray0[0] = "t+WbM_e?-)|";
      stringArray0[1] = "Invalid pattern syntax";
      stringArray0[2] = "Null Pointer Exception";
      stringArray0[3] = "Null Pointer Exception";
      int int0 = Boolean.compare(false, false);
      assertEquals(0, int0);
      
      stringArray0[4] = "Null Pointer Exception";
      Boolean boolean1 = Boolean.valueOf(false);
      assertFalse(boolean1);
      assertFalse(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      assertFalse(fileDescriptor0.valid());
      assertNotNull(fileDescriptor0);
      
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      assertNotNull(mockFileInputStream0);
      
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      assertFalse(fileDescriptor0.valid());
      assertNotNull(pushbackInputStream0);
      
      try { 
        grepApplication0.grepFromStdin((String) null, boolean1, boolean1, pushbackInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = new Boolean(false);
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      try { 
        grepApplication0.grepFromStdin("No such file or directory", boolean0, boolean0, (InputStream) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String string0 = "No InputStream and no filenames";
      Boolean boolean0 = null;
      PipedInputStream pipedInputStream0 = new PipedInputStream(124);
      assertEquals(0, pipedInputStream0.available());
      assertNotNull(pipedInputStream0);
      
      try { 
        grepApplication0.grepFromStdin("No InputStream and no filenames", (Boolean) null, (Boolean) null, pipedInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = new Boolean(true);
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)63;
      byteArray0[1] = (byte) (-110);
      byteArray0[2] = (byte)99;
      Environment.currentDirectory = "NA1Bt4";
      byteArray0[3] = (byte) (-107);
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte)0;
      String string0 = "This is a directory";
      int int0 = Boolean.compare(true, true);
      assertEquals(0, int0);
      
      boolean boolean1 = Boolean.getBoolean("This is a directory");
      assertFalse(boolean1);
      
      byteArray0[6] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-110), (byte) (-107));
      assertEquals(7, byteArray0.length);
      assertEquals((-107), byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)63, (byte) (-110), (byte)99, (byte) (-107), (byte) (-1), (byte)0, (byte)0}, byteArray0);
      
      int int1 = byteArrayInputStream0.read(byteArray0);
      assertEquals(7, byteArray0.length);
      assertEquals((-1), int1);
      assertFalse(int1 == int0);
      assertEquals((-107), byteArrayInputStream0.available());
      assertArrayEquals(new byte[] {(byte)63, (byte) (-110), (byte)99, (byte) (-107), (byte) (-1), (byte)0, (byte)0}, byteArray0);
      
      try { 
        grepApplication0.grepFromStdin("mfFVuO[=Lq^S", boolean0, boolean0, byteArrayInputStream0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable cannot be cast to sg.edu.nus.comp.cs4218.exception.GrepException
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String string0 = "";
      Environment.currentDirectory = "";
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Invalid pattern syntax";
      stringArray0[1] = "Pattern should not be empty.";
      stringArray0[2] = "Pattern should not be empty.";
      Boolean boolean0 = Boolean.TRUE;
      assertTrue(boolean0);
      assertNotNull(boolean0);
      
      try { 
        grepApplication0.grepFromFiles("No such file or directory", boolean0, boolean0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = Boolean.valueOf("Pattern should not be empty.");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      boolean boolean1 = Boolean.logicalOr(false, false);
      assertFalse(boolean1);
      
      boolean boolean2 = Boolean.logicalAnd(false, true);
      assertFalse(boolean2);
      assertTrue(boolean2 == boolean1);
      
      String[] stringArray0 = new String[0];
      String string0 = grepApplication0.grepFromFiles("", boolean0, boolean0, stringArray0);
      assertEquals(0, stringArray0.length);
      assertEquals("", string0);
      assertTrue(boolean0.equals((Object)boolean1));
      assertTrue(boolean0.equals((Object)boolean2));
      assertNotNull(string0);
      
      try { 
        grepApplication0.grepFromFiles((String) null, (Boolean) null, boolean0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = new Boolean((String) null);
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      Boolean boolean1 = Boolean.valueOf(false);
      assertFalse(boolean1);
      assertTrue(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = null;
      stringArray0[1] = "Invalid pattern syntax";
      stringArray0[2] = "This is a directory";
      stringArray0[3] = "U)>";
      try { 
        grepApplication0.grepFromFiles("U)>", boolean0, boolean1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String string0 = "sg.edu.nus.comp.cs4218.Environment";
      Boolean boolean0 = new Boolean(false);
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      Boolean boolean1 = Boolean.TRUE;
      assertTrue(boolean1);
      assertFalse(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((PipedOutputStream) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String string0 = ".%{BQL#-FgFh'8[EW";
      Boolean boolean0 = new Boolean("Pattern should not be empty.");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      Boolean boolean1 = Boolean.FALSE;
      assertFalse(boolean1);
      assertTrue(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String string0 = "`Ujc]^Am=f$b9?vo";
      boolean boolean0 = true;
      Boolean boolean1 = new Boolean(true);
      assertTrue(boolean1);
      assertTrue(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Null Pointer Exception";
      stringArray0[1] = "`Ujc]^Am=f$b9?vo";
      boolean boolean2 = Boolean.logicalAnd(true, true);
      assertTrue(boolean2);
      assertTrue(boolean2 == boolean0);
      
      stringArray0[2] = "os.name";
      PipedInputStream pipedInputStream0 = null;
      try {
        pipedInputStream0 = new PipedInputStream((-1839));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Pipe Size <= 0
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }


  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      String string0 = "-q=)\")< ";
      Boolean boolean0 = Boolean.FALSE;
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      Boolean boolean1 = Boolean.valueOf("Invalid pattern syntax");
      assertFalse(boolean1);
      assertNotNull(boolean1);
      
      MockFileInputStream mockFileInputStream0 = null;
      try {
        mockFileInputStream0 = new MockFileInputStream((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = Boolean.FALSE;
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      String string0 = null;
      Boolean boolean1 = new Boolean((String) null);
      assertFalse(boolean1);
      assertTrue(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      Boolean boolean2 = Boolean.TRUE;
      assertTrue(boolean2);
      assertFalse(boolean2.equals((Object)boolean1));
      assertFalse(boolean2.equals((Object)boolean0));
      assertNotNull(boolean2);
      
      Boolean boolean3 = new Boolean(true);
      assertTrue(boolean3);
      assertFalse(boolean3.equals((Object)boolean0));
      assertTrue(boolean3.equals((Object)boolean2));
      assertFalse(boolean3.equals((Object)boolean1));
      assertNotNull(boolean3);
      
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)106;
      byteArray0[1] = (byte)55;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)0;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertEquals(4, byteArray0.length);
      assertEquals(4, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)106, (byte)55, (byte) (-1), (byte)0}, byteArray0);
      
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      assertEquals(4, byteArray0.length);
      assertEquals(4, byteArrayInputStream0.available());
      assertNotNull(bufferedInputStream0);
      assertArrayEquals(new byte[] {(byte)106, (byte)55, (byte) (-1), (byte)0}, byteArray0);
      
      String string1 = grepApplication0.grepFromStdin("s+", boolean2, boolean3, bufferedInputStream0);
      assertEquals(4, byteArray0.length);
      assertEquals("0\n", string1);
      assertTrue(boolean2.equals((Object)boolean3));
      assertFalse(boolean2.equals((Object)boolean1));
      assertFalse(boolean2.equals((Object)boolean0));
      assertFalse(boolean3.equals((Object)boolean0));
      assertTrue(boolean3.equals((Object)boolean2));
      assertFalse(boolean3.equals((Object)boolean1));
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(string1);
      assertArrayEquals(new byte[] {(byte)106, (byte)55, (byte) (-1), (byte)0}, byteArray0);
      
      int int0 = Boolean.compare(true, true);
      assertEquals(0, int0);
      
      byte[] byteArray1 = new byte[3];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte) (-108);
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)48;
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray1, 7807, 0);
      assertEquals(3, byteArray1.length);
      assertFalse(byteArrayInputStream1.equals((Object)byteArrayInputStream0));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertEquals((-7804), byteArrayInputStream1.available());
      assertNotNull(byteArrayInputStream1);
      assertArrayEquals(new byte[] {(byte) (-108), (byte)0, (byte)48}, byteArray1);
      
      int int1 = byteArrayInputStream1.read();
      assertNotSame(byteArrayInputStream1, byteArrayInputStream0);
      assertNotSame(byteArray1, byteArray0);
      assertEquals(3, byteArray1.length);
      assertEquals((-1), int1);
      assertFalse(byteArrayInputStream1.equals((Object)byteArrayInputStream0));
      assertFalse(int1 == int0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertEquals((-7804), byteArrayInputStream1.available());
      assertArrayEquals(new byte[] {(byte) (-108), (byte)0, (byte)48}, byteArray1);
      
      BufferedInputStream bufferedInputStream1 = new BufferedInputStream(byteArrayInputStream1);
      assertEquals(3, byteArray1.length);
      assertFalse(byteArrayInputStream1.equals((Object)byteArrayInputStream0));
      assertFalse(bufferedInputStream1.equals((Object)bufferedInputStream0));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertEquals((-7804), byteArrayInputStream1.available());
      assertNotNull(bufferedInputStream1);
      assertArrayEquals(new byte[] {(byte) (-108), (byte)0, (byte)48}, byteArray1);
      
      try { 
        grepApplication0.grepFromStdin(")4(a", boolean0, boolean1, bufferedInputStream1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable cannot be cast to sg.edu.nus.comp.cs4218.exception.GrepException
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      assertNotNull(grepApplication0);
      
      Boolean boolean0 = new Boolean(false);
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      String string0 = "";
      Boolean boolean1 = Boolean.valueOf("");
      assertFalse(boolean1);
      assertTrue(boolean1.equals((Object)boolean0));
      assertNotNull(boolean1);
      
      byte[] byteArray0 = new byte[2];
      boolean boolean2 = Boolean.getBoolean("Nd");
      assertFalse(boolean2);
      
      byteArray0[0] = (byte)116;
      byteArray0[1] = (byte)94;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      assertEquals(2, byteArray0.length);
      assertEquals(2, byteArrayInputStream0.available());
      assertNotNull(byteArrayInputStream0);
      assertArrayEquals(new byte[] {(byte)116, (byte)94}, byteArray0);
      
      String string1 = grepApplication0.grepFromStdin("", boolean0, boolean1, byteArrayInputStream0);
      assertEquals(2, byteArray0.length);
      assertEquals("t^\n", string1);
      assertTrue(boolean0.equals((Object)boolean1));
      assertTrue(boolean0.equals((Object)boolean2));
      assertTrue(boolean1.equals((Object)boolean2));
      assertTrue(boolean1.equals((Object)boolean0));
      assertFalse(string1.equals((Object)string0));
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(string1);
      assertArrayEquals(new byte[] {(byte)116, (byte)94}, byteArray0);
      
      Boolean boolean3 = Boolean.valueOf((String) null);
      assertFalse(boolean3);
      assertTrue(boolean3.equals((Object)boolean2));
      assertTrue(boolean3.equals((Object)boolean0));
      assertNotNull(boolean3);
      
      Boolean boolean4 = Boolean.TRUE;
      assertTrue(boolean4);
      assertFalse(boolean4.equals((Object)boolean3));
      assertFalse(boolean4.equals((Object)boolean2));
      assertFalse(boolean4.equals((Object)boolean1));
      assertFalse(boolean4.equals((Object)boolean0));
      assertNotNull(boolean4);
      
      Boolean boolean5 = Boolean.valueOf(false);
      assertFalse(boolean5);
      assertFalse(boolean5.equals((Object)boolean4));
      assertTrue(boolean5.equals((Object)boolean0));
      assertTrue(boolean5.equals((Object)boolean2));
      assertNotNull(boolean5);
      
      String string2 = grepApplication0.grepFromStdin("t^\n", boolean4, boolean5, byteArrayInputStream0);
      assertEquals(2, byteArray0.length);
      assertEquals("", string2);
      assertFalse(boolean4.equals((Object)boolean3));
      assertFalse(boolean4.equals((Object)boolean2));
      assertFalse(boolean4.equals((Object)boolean5));
      assertFalse(boolean4.equals((Object)boolean1));
      assertFalse(boolean4.equals((Object)boolean0));
      assertFalse(boolean5.equals((Object)boolean4));
      assertTrue(boolean5.equals((Object)boolean0));
      assertTrue(boolean5.equals((Object)boolean2));
      assertFalse(string2.equals((Object)string1));
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(string2);
      assertArrayEquals(new byte[] {(byte)116, (byte)94}, byteArray0);
      
      String string3 = grepApplication0.grepFromStdin("Nd", boolean1, boolean3, byteArrayInputStream0);
      assertEquals(2, byteArray0.length);
      assertEquals("", string3);
      assertFalse(boolean1.equals((Object)boolean4));
      assertTrue(boolean1.equals((Object)boolean2));
      assertTrue(boolean1.equals((Object)boolean0));
      assertTrue(boolean3.equals((Object)boolean2));
      assertFalse(boolean3.equals((Object)boolean4));
      assertTrue(boolean3.equals((Object)boolean0));
      assertFalse(string3.equals((Object)string1));
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(string3);
      assertArrayEquals(new byte[] {(byte)116, (byte)94}, byteArray0);
      
      String string4 = grepApplication0.grepFromStdin("user.dir", boolean3, boolean0, byteArrayInputStream0);
      assertEquals(2, byteArray0.length);
      assertEquals("", string4);
      assertTrue(boolean0.equals((Object)boolean1));
      assertTrue(boolean0.equals((Object)boolean5));
      assertFalse(boolean0.equals((Object)boolean4));
      assertTrue(boolean0.equals((Object)boolean2));
      assertTrue(boolean0.equals((Object)boolean3));
      assertTrue(boolean3.equals((Object)boolean2));
      assertFalse(boolean3.equals((Object)boolean4));
      assertTrue(boolean3.equals((Object)boolean0));
      assertFalse(string4.equals((Object)string1));
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(string4);
      assertArrayEquals(new byte[] {(byte)116, (byte)94}, byteArray0);
      
      Boolean boolean6 = Boolean.valueOf("");
      assertFalse(boolean6);
      assertTrue(boolean6.equals((Object)boolean2));
      assertFalse(boolean6.equals((Object)boolean4));
      assertTrue(boolean6.equals((Object)boolean0));
      assertNotNull(boolean6);
      
      Boolean boolean7 = new Boolean(true);
      assertTrue(boolean7);
      assertFalse(boolean7.equals((Object)boolean5));
      assertFalse(boolean7.equals((Object)boolean1));
      assertFalse(boolean7.equals((Object)boolean0));
      assertTrue(boolean7.equals((Object)boolean4));
      assertFalse(boolean7.equals((Object)boolean2));
      assertFalse(boolean7.equals((Object)boolean3));
      assertFalse(boolean7.equals((Object)boolean6));
      assertNotNull(boolean7);
      
      String string5 = grepApplication0.grepFromStdin("To", boolean6, boolean7, byteArrayInputStream0);
      assertEquals(2, byteArray0.length);
      assertEquals("0\n", string5);
      assertTrue(boolean6.equals((Object)boolean2));
      assertFalse(boolean6.equals((Object)boolean7));
      assertFalse(boolean6.equals((Object)boolean4));
      assertTrue(boolean6.equals((Object)boolean0));
      assertFalse(boolean7.equals((Object)boolean5));
      assertFalse(boolean7.equals((Object)boolean1));
      assertFalse(boolean7.equals((Object)boolean0));
      assertTrue(boolean7.equals((Object)boolean4));
      assertFalse(boolean7.equals((Object)boolean2));
      assertFalse(boolean7.equals((Object)boolean3));
      assertFalse(boolean7.equals((Object)boolean6));
      assertFalse(string5.equals((Object)string2));
      assertFalse(string5.equals((Object)string0));
      assertFalse(string5.equals((Object)string3));
      assertFalse(string5.equals((Object)string4));
      assertFalse(string5.equals((Object)string1));
      assertEquals(0, byteArrayInputStream0.available());
      assertNotNull(string5);
      assertArrayEquals(new byte[] {(byte)116, (byte)94}, byteArray0);
      
      Boolean boolean8 = null;
      try { 
        grepApplication0.grepFromStdin("", (Boolean) null, boolean3, byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Pattern should not be empty.";
      stringArray0[1] = "Invalid pattern syntax";
      InputStream inputStream0 = null;
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null);
      String string0 = "Pattern should not be empty.";
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Pattern should not be empty.");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      GrepException grepException0 = new GrepException("Invalid pattern syntax");
      mockPrintStream0.println((Object) grepException0);
      grepApplication0.run(stringArray0, bufferedInputStream0, mockPrintStream0);
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = true;
      Boolean.logicalAnd(true, false);
      Boolean.compare(true, true);
      grepApplication0.grepFromFiles("Pattern should not be empty.", boolean0, boolean0, stringArray0);
      Boolean boolean2 = Boolean.FALSE;
      grepApplication0.grepFromFiles("Invalid pattern syntax", boolean0, boolean2, stringArray0);
      try { 
        grepApplication0.grepFromFiles((String) null, boolean0, boolean0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // grep: Null Pointer Exception
         //
         verifyException("sg.edu.nus.comp.cs4218.impl.app.GrepApplication", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GrepApplication grepApplication0 = new GrepApplication();
      Boolean boolean0 = Boolean.FALSE;
      Boolean boolean1 = Boolean.valueOf(false);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      String string0 = grepApplication0.grepFromFiles("", boolean0, boolean1, stringArray0);
      assertEquals(": No such file or directory\n", string0);
  }
}
