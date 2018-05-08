package fileoperation;

import java.util.ArrayList;

import util.ArrayListToStringArray;
import util.CheckNum;
import util.FileOperation;
import util.LoadProperties;
public class ReadNameFile {

/////////////////////クラス変数定義///////////////////////
	//読み込みファイルのタイプ
	final int TYPE_F=0;
	final int TYPE_E=9;//仮置き　まだファイルが増える
/////////////////////クラス変数定義///////////////////////


	/**
	 * 読込み対象ファイルを設定する
	 *
	 * @param type 取得する名前ファイルを設定
	 *  0:ワールド名
	 *  1:街名
	 *  2:ダンジョン名
	 *  3:店名
	 *  4:アイテム名
	 *  5:モンスター名
	 *  6:モンスター装飾語
	 *  7:強モンスター装飾語
	 *  8:ラスボスの修飾語
	 *
	 * @return
	 *
	 * */
	public String[] getNameFilesContents(int type){

		FileOperation fo=new FileOperation();
		LoadProperties lp=new LoadProperties();
		ArrayListToStringArray as=new ArrayListToStringArray();
		CheckNum check=CheckNum.getInstance();
		boolean ret1=true;
		String keyword;
		String[] result;
		ArrayList<String> tmp=new ArrayList<String>();

		//入力された値がファイルタイプであるかチェック
		ret1=check.checkBetween(type,TYPE_F,TYPE_E);

		if(ret1!=true){
			System.exit(9);
		}

		keyword=setFilesContents(type);
		//正常にキーワドが取得できなかった場合の処理
		if(keyword.isEmpty()){
			System.exit(9);
		}

		//ArrayListでファイルの内容を取得
		tmp=fo.getFileContents(lp.getFilePath(keyword));

		//ArrayListをString配列に変換
		result=as.ConversionArrayList(tmp);
		return result;
	}

	//ファイル取得用のキーワード設定
	private String setFilesContents(int filetype){

		String ret=null;

		try{
			switch(filetype){

			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
				//変な値が入ってきた時用
				default :
					ret=null;
			}
		}
		//何か例外が発生したときの処理
		catch(Exception e){
		}
		return ret;
	}
}
