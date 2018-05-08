package noukinn_test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import util.FileOperation;

public class FileOperation_Test {

	FileOperation fileOperation=new FileOperation();

	@Test
	public void ファイル読込みテスト(){
		ArrayList<String> getCont=fileOperation.getFileContents("files/world");
		String suppose="あいうえお";
		assertThat(suppose,is(getCont.get(0)));
	}
}
