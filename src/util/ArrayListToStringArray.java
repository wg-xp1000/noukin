package util;

import java.util.ArrayList;

public class ArrayListToStringArray {

	/**
	 * ArrayList<String>をString[]に変換する
	 *
	 * @param list 変換対象のArrayList<String>
	 *
	 * @return result ArrayList<String>を変換したString[]
	 *
	 * */
	public String[] ConversionArrayList(ArrayList<String> list){

		String[] result=null;

		if(!list.isEmpty()){
			result=(String[]) list.toArray();
		}
		return result;
	}
}
