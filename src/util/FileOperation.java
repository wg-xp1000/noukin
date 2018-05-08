package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileOperation {

	/**
	 * ファイル内の行を全て取得する
	 *
	 * @param filePath 取得対象のファイルのパス
	 *
	 * @return ArrayList 中身がStringのArrayListを返却
	 *
	 * */
	public ArrayList<String> getFileContents(String filePath){
		BufferedReader br=loadFile(filePath);
		ArrayList<String> fileContents=new ArrayList<String>();
		String tmpContent=null;
		do{
			try{
				tmpContent=br.readLine();
				if(!tmpContent.equals(null)){
					fileContents.add(tmpContent);
				}
			}
			catch(Exception e){
				e.printStackTrace();
				fileContents.clear();;
				break;
			}
			finally{
				try{
					br.close();
				}
				catch(Exception e){
					e.printStackTrace();
					fileContents=null;
				}
			}
		}while(tmpContent.equals(null));
		return fileContents;
	}

	//読込みファイルのBufferedReaderを取得
	private BufferedReader loadFile(String filePath){

		File file=new File(filePath);
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try{
			fileReader=new FileReader(file);
			bufferedReader=new BufferedReader(fileReader);
			return bufferedReader;
		}
		catch(Exception e){
			e.printStackTrace();
			return bufferedReader;
		}
	}
}
