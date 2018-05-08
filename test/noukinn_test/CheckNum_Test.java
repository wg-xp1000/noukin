package noukinn_test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import util.CheckNum;

public class CheckNum_Test {
	CheckNum chnum = CheckNum.getInstance();

	//checkEqualsのテスト
	@Test
	public void checkEquals_equal_Test() {
		boolean suppose=true;
		boolean ret=chnum.checkEquals(1,1);

		assertThat(suppose,is(ret));
	}

	@Test
	public void chedkEquals_notequal_Test(){
		boolean suppose=false;
		boolean ret=chnum.checkEquals(1,2);

		assertThat(suppose,is(ret));
	}

	//checkBetweenのテスト
	@Test
	public void checkBetween_ok_Test(){
		boolean suppose=true;
		boolean ret=chnum.checkBetween(0, -1, 5);

		assertThat(suppose,is(ret));
	}

	@Test
	public void checkBetween_ng_Test(){
		boolean suppose=false;
		boolean ret=chnum.checkBetween(6, 0, 6);

		assertThat(suppose,is(ret));
	}

}
