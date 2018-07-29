package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {

	/**
	 * プロパティファイルをロードする
	 * @param fileName ロードするプロパティファイルの名前
	 * @return 正常終了:Propertiesのオブジェクト 異常終了:null
	 * */
	private Properties getProperties(String fileName){
		final Properties prop=new Properties();
		InputStream inStream=null;

		try{
			inStream=new BufferedInputStream(new FileInputStream(fileName));
			prop.load(inStream);
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		finally{
			try{
			inStream.close();
			}
			catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}
		return prop;
	}

	/**
	 * プロパティファイルからファイルパスを取得
	 * @param key プロパティファイルから値を読み出すキー
	 * @return 正常終了:ファイルパス 異常終了:null
	 * */
	public String getFilePath(String key){

		final Properties prop = this.getProperties("filePath.properties");
		String value = null;

		if(!prop.equals(null)){
			value = prop.getProperty(key);
		}
		return value;
	}

	/**
	 * プロパティファイルから作成個数を取得
	 * @param key プロパティファイルから値を読み出すキー
	 * @return value 正常終了:ダンジョン作成数 異常終了:-1
	 * */
	public int getCreateNum(String key){

		final Properties prop = this.getProperties("createDungeonNum.properties");
		String value = null;
		int ret = -1;

		if(!prop.equals(null)){
			value = prop.getProperty(key);
		}

		if(!value.equals(null)){
			ret = Integer.parseInt(value);
		}
		return ret;
	}

	/**
	 * プロパティファイルから次レベル経験値を取得
	 * @param key プレイヤーキャラのレベル
	 * @return 正常終了:次レベルの経験値 異常終了:-1
	 * */
	public int getExperienceTable(String key){

		final Properties prop = this.getProperties("experienceTable.properties");
		String value = null;
		int ret = -1;

		if(!prop.equals(null)){
			value=prop.getProperty(key);
		}

		if(!value.equals(null)){
			ret = Integer.parseInt(value);
		}
		return ret;
	}

	/**
	 * プロパティファイルからアイテムドロップパワーの閾値を取得
	 * @param key アイテムドロップパワー
	 * @return 正常終了:アイテムドロップパワーの閾値 異常終了:-1
	 * */
	public int getItepDropPower(String key){
		final Properties prop = this.getProperties("itemGenerate.properties");
		String value = null;
		int ret = -1;

		if(!prop.equals(null)){
			value = prop.getProperty(key);
		}

		if(!value.equals(null)){
			ret = Integer.parseInt(value);
		}
		return ret;
	}

	/**
	 * プロパティファイルからアイテム品質決定の値を取得
	 * @param key アイテム品質のキー
	 * @return 正常終了:アイテム品質 異常終了:-1
	 * */
	public int getItemGeneratePower(String key){
		final Properties prop = this.getProperties("itemGeneratePower.properties");
		String value = null;
		int ret = -1;

		if(!prop.equals(null)){
			value = prop.getProperty(key);
		}

		if(!value.equals(null)){
			ret = Integer.parseInt(value);
		}
		return ret;
	}
}
