package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.StudentDao;
import util.DBUtils;

public class test01 {
	
	@Test
	public void test01() throws Exception {
		System.out.println(DBUtils.getconn());
	}
	
	@Test
	public void test02() throws Exception {
		System.out.println(new StudentDao().register("lisi", "lisi", "男"));
	}
	
	@Test
	public void test03() throws Exception {
		System.out.println(new StudentDao().listAll());
	}
	
	@Test
	public void test04() throws Exception {
		System.out.println(new StudentDao().deleteById("9"));
	}
	
	@Test
	public void test05() throws Exception {
		System.out.println(new StudentDao().updateById("ee", "ee", "女", "8"));
	}

}
