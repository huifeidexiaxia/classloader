package com.study.j2se.classpath;

public class TestMain {
	public static void main(String[] args) {
		// 当前类(.class)所在的包目录
		System.out.println(TestMain.class.getResource(""));
		// classpath 所在的目录
		System.out.println(TestMain.class.getResource("/"));

		System.out.println(TestMain.class.getResource("2.properties"));

		System.out.println(TestMain.class.getResource("sub/3.properties").getFile());
		System.out.println(TestMain.class.getResource("/1.properties"));

		System.out.println("==========================***===============");
		/**
		 * ※Class.getResource和Class.getResourceAsStream在使用时，路径选择上是一样的。
		 */

		/**
		 * Class.getClassLoader（）.getResource(String path) path不能以’/'开头时；
		 * path是从ClassPath根下获取；
		 */

		TestMain t = new TestMain();
		System.out.println(t.getClass());
		System.out.println(t.getClass().getClassLoader());
		System.out.println(t.getClass().getClassLoader().getResource(""));

		// return null
		System.out.println(t.getClass().getClassLoader().getResource("/"));
		
		
		System.out.println("================**********=========================");
		System.out.println(t.getClass().getClassLoader().getResource("1.properties"));
		System.out.println(TestMain.class.getClassLoader().getResource("1.properties"));
		System.out.println(TestMain.class.getClassLoader().getResource("2.properties"));
		System.out.println(t.getClass().getClassLoader().getResource("2.properties"));
		System.out.println(t.getClass().getClassLoader().getResource("3.properties"));
		System.out.println(t.getClass().getClassLoader().getResource("1.properties").getFile());
		System.out.println(t.getClass().getClassLoader().getResource("/com/study/j2se/classpath/2.properties"));
		System.out.println(t.getClass().getClassLoader().getResource("/com/study/j2se/classpath/sub/3.properties"));
		
		/**
		 * 
		 * ※Class.getClassLoader（）.getResource《==》Class.getClassLoader（）.getResourceAsStream在使用时，路径选择上也是一样的
		 */
	}
}
