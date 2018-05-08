package util;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {

	/**
	 * プロパティファイルをロードする
	 *
	 * @param fileName ロードするプロパティファイルの名前
	 *
	 * @return ロードしたPropertiesのオブジェクト
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
	 *
	 * @param key プロパティファイルから値を読み出すキー
	 *
	 * @return value 取得した文字列を返却 エラー時はnullを返却
	 * */
	public String getFilePath(String key){

		final Properties prop = getProperties("filePath.properties");
		String value = null;

		if(!prop.equals(null)){
			value = prop.getProperty(key);
		}
		return value;
	}

	/**
	 * プロパティファイルから作成個数を取得
	 *
	 * @param key プロパティファイルから値を読み出すキー
	 *
	 * @return value 取得した値をint型に変換して返却 エラー時は-1を返却
	 * */
	public int getCreateNum(String key){

		final Properties prop = getProperties("createDungeonNum.properties");
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
	 *
	 * @param key プレイヤーキャラのレベル
	 *
	 * @return 取得した経験値の値 値が取得できなかったら-1を返す
	 * */
	public int getExperienceTable(String key){

		final Properties prop = getProperties("experienceTable.properties");
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
	 *
	 * @param key アイテムドロップパワー
	 *
	 * @return 取得したアイテムドロップパワーの閾値
	 * */
	public int getItepDropPower(String key){
		final Properties prop = getProperties("itemGenerate.properties");
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
	 *
	 * @param key アイテム品質のキー
	 *
	 * @return 取得したアイテム品質決定の値
	 *
	 * */
	public int getItemGeneratePower(String key){
		final Properties prop = getProperties("itemGeneratePower.properties");
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
