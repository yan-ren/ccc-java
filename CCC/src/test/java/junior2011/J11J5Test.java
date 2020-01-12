package junior2011;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J11J5Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j11/j5/j5.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j11/j5/j5.1.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J11J5().run(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j11/j5/j5.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j11/j5/j5.2.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J11J5().run(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j11/j5/j5.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j11/j5/j5.3.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J11J5().run(br1));
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j11/j5/j5.4.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j11/j5/j5.4.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J11J5().run(br1));
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j11/j5/j5.5.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j11/j5/j5.5.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J11J5().run(br1));
	}
}
