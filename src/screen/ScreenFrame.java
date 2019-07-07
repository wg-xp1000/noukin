package screen;

import javax.swing.JFrame;

/**
 * 画面の元を作るやつ
 * こいつを呼び出して必要な情報をセットして各画面にする
 * */
public class ScreenFrame {

	private JFrame screen;

	private final ScreenFrame screenFrame = new ScreenFrame();
	private ScreenFrame(){
		this.screen = new JFrame("脳筋クエスト");
		this.screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.screen.setSize(400,300);
		this.screen.setVisible(true);
		this.screen.setLocationRelativeTo(null);
	}

	public ScreenFrame getScreenFrame(){
		return this.screenFrame;
	}
	public JFrame getScreen(){
		return this.screen;
	}

}
