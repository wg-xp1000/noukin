package noukinn_test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import util.LoadProperties;

public class LoadProperties_Test {

	LoadProperties loadprop=new LoadProperties();

	@Test
	public void LoadProperties_world(){
		String chk=loadprop.getFilePath("world");
		String suppose="files/world";

		assertThat(suppose,is(chk));
	}

	@Test
	public void LoadProperties_getFilePath_error(){
		String chk=loadprop.getFilePath("aaa");
		String suppose=null;

		assertThat(suppose,is(chk));
	}

	@Test
	public void LoadPropaties_maxDungeonNum(){
		int chk=loadprop.getCreateNum("maxDungeonNum");
		int suppose=10;

		assertThat(suppose,is(chk));
	}

	@Test
	public void LoadPropaties_getCreateNum_error(){
		int chk=loadprop.getCreateNum("aaa");
		int suppose=-1;

		assertThat(suppose,is(chk));
	}
}
