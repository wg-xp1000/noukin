package util;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import struct.AtInfo;

public class XmlFileOperation {

	private AtInfo pcInfo=AtInfo.getInstance();

	//Documentインスタンスの生成
	private Document getDocumentInstance(){
		DocumentBuilder documentBuilder=null;
		try{
			documentBuilder=DocumentBuilderFactory.newInstance().newDocumentBuilder();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		Document document=documentBuilder.newDocument();

		return document;
	}

	private boolean writeXML(String writePath){


		return true;
	}

	/**
	 * プレイヤーキャラのファイルを読み込む
	 * */
	public boolean loadAtInfo(){


	}
	/**
	 * プレイヤーキャラのファイルに書き込む
	 *
	 * */
	public boolean writeAtInfo(){

		Document doc = getDocumentInstance();
		//ルート
		Element PC = doc.createElement("PC");

		//PC情報
		Element name = doc.createElement("name");
		Element level = doc.createElement("level");
		Element experience = doc.createElement("experience");
		Element race = doc.createElement("race");
		Element job = doc.createElement("job");
		Element personality = doc.createElement("personality");
		//装備
		Element equipment = doc.createElement("equipment");
		//装備にぶらせげる部位
		Element head = doc.createElement("head");
		Element neck = doc.createElement("neck");
		Element body = doc.createElement("body");
		Element arm = doc.createElement("arm");
		Element leg = doc.createElement("leg");
		Element righthand = doc.createElement("righthand");
		Element lefthand = doc.createElement("lefthand");
		Element rightfinger = doc.createElement("rightfinger");
		Element leftfinger = doc.createElement("leftfinger");
		//所持品
		Element inventory = doc.createElement("inventory");
		//所持品にぶらさげるやつ
		//一応装備品枠
		Element item1 = doc.createElement("item1");
		Element item2 = doc.createElement("item2");
		Element item3 = doc.createElement("item");
		Element item4 = doc.createElement("item");
		Element item5 = doc.createElement("item");
		Element item6 = doc.createElement("item");
		Element item7 = doc.createElement("item");
		Element item8 = doc.createElement("item");
		Element item9 = doc.createElement("item");
		//持ち物枠
		Element item10 = doc.createElement("item");
		Element item11 = doc.createElement("item");
		Element item12 = doc.createElement("item");
		Element item13 = doc.createElement("item");
		Element item14 = doc.createElement("item");
		Element item15 = doc.createElement("item");
		Element item16 = doc.createElement("item");
		Element item17 = doc.createElement("item");
		Element item18 = doc.createElement("item");
		Element item19 = doc.createElement("item");
		Element item20 = doc.createElement("item");

		//PCの性能を格納
		name.appendChild(doc.createTextNode(pcInfo.name));
		level.appendChild(doc.createTextNode(pcInfo.level.toString()));
		experience.appendChild(doc.createTextNode(pcInfo.experience.toString()));
		race.appendChild(doc.createTextNode(pcInfo.race.toString()));
		job.appendChild(doc.createTextNode(pcInfo.job.toString()));
		personality.appendChild(doc.createTextNode(pcInfo.personality.toString()));

		//PCの装備品を格納
		head.appendChild(doc.createTextNode(pcInfo.equips[0].toString()));
		neck.appendChild(doc.createTextNode(pcInfo.equips[1].toString()));

		//PCの所持品を格納


		//XMLのツリーを構築
		doc.appendChild(PC);
		PC.appendChild(name);
		PC.appendChild(level);
		PC.appendChild(experience);
		PC.appendChild(race);
		PC.appendChild(job);
		PC.appendChild(personality);
		PC.appendChild(equipment);
		PC.appendChild(inventory);
		equipment.appendChild(head);
		equipment.appendChild(neck);
		equipment.appendChild(body);
		equipment.appendChild(arm);
		equipment.appendChild(leg);
		equipment.appendChild(righthand);
		equipment.appendChild(lefthand);
		equipment.appendChild(rightfinger);
		equipment.appendChild(leftfinger);
		inventory.appendChild(item1);
		inventory.appendChild(item2);
		inventory.appendChild(item3);
		inventory.appendChild(item4);
		inventory.appendChild(item5);
		inventory.appendChild(item6);
		inventory.appendChild(item7);
		inventory.appendChild(item8);
		inventory.appendChild(item9);
		inventory.appendChild(item10);
		inventory.appendChild(item11);
		inventory.appendChild(item12);
		inventory.appendChild(item13);
		inventory.appendChild(item14);
		inventory.appendChild(item15);
		inventory.appendChild(item16);
		inventory.appendChild(item17);
		inventory.appendChild(item18);
		inventory.appendChild(item19);
		inventory.appendChild(item20);



		PC.appendChild(doc.createTextNode(pcInfo.name));
	}

	/**
	 * モンスター情報のファイルを読み込む
	 * */
	public loadCreatureInfo(){

	}

	/**
	 * モンスターの情報のファイルに書き込み
	 * */
	public writeCreatureInfo(){

	}

	/**
	 * ワールド情報のファイルを読み込む
	 * */
	public loadWorldInfo(){

	}

	/**
	 * ワールド情報のファイルに書き込み
	 * */
	public writeWorldInfo(){

	}
	/***/
	/***/
	/***/
	/***/
	/***/
	/***/
	/***/
	/***/
	/***/
}
