package noukinn_test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import util.CheckNum;
import util.CreateRandomNumber;

public class CreateRandomuNumber_test {

	CreateRandomNumber CRN=CreateRandomNumber.getInstance();
	CheckNum CN=CheckNum.getInstance();

	@Test
	public void getRandomInt_ok_test() {
		int ret=CRN.getRandomInt(100);
		boolean chk=CN.checkBetween(ret, 0, 101);
		boolean suppose=true;
		assertThat(suppose,is(chk));
	}

	@Test
	public void getRandomInt_ng_test(){
		int ret=CRN.getRandomInt(100);
		boolean chk=CN.checkBetween(ret, 101, 200);
		boolean suppose=false;
		assertThat(suppose,is(chk));
	}

}
