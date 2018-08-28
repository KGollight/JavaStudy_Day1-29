package api.awt.graphic;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * Frame�� Ȯ���� Ŭ����
 */
class Window05 extends Frame{
	
	/**
	 * �ʿ��� �ν��Ͻ��� ��� ������ ����
	 */
	
	private class CanvasEx extends Canvas{
		private int x = 10, y = 10, width = 250, height = 250;
		private Image img;
		
		@Override
		public void paint(Graphics g) {
			if(img!=null)
				g.drawImage(img, x, y, width, height, this);
		}
	}
	
	//�ν��Ͻ�
	private CanvasEx can = new CanvasEx();
	
	/**
	 * ȭ�� ��ġ�� ó���ϴ� �޼ҵ�
	 */
	private void display() {
		this.add(can);
	}
	
	/**
	 * �̺�Ʈ ó�� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void event() {
		//x ��ư�� ������ â�� �����ϴ� �̺�Ʈ ����
		WindowListener w = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(w);
	}
	
	/**
	 * �޴� ���� �ڵ带 �ۼ��ϴ� �޼ҵ�
	 */
	private void menu() {
		
	}
	
	public Window05() {
		display();
		event();
		menu();
		
		//ǥ�� ���� â�� ���õ� �پ��� ó���� ���� ����
		setTitle("GUI �׽�Ʈ");
		setLocation(500, 200);	//x : 500, y : 200	(���� �� �𼭸� ����)
		setSize(600, 500);			//�� : 600 , ���� : 500
		setResizable(false);		//ũ�� ���� �Ұ�
		
		setVisible(true);				//ȭ�� ǥ��
		
		moving();
	}
	
	public void moving() {
		try {
			//[1] �̹����� �ҷ��´�.(run.png)
			// -> BufferedImage ���·� �ҷ��;� ������ �����ϴ�.
			BufferedImage buf = ImageIO.read(new File("image/run.png"));
			
			//[2] �̹����� �߶� �迭���·� �����Ѵ�.
			int w = buf.getWidth()/9;
			int h = buf.getHeight();
			BufferedImage[] arr = new BufferedImage[9];
			for(int i=0; i<arr.length; i++) {
				arr[i] = buf.getSubimage(i*w, 0, w, h);
			}
			
			//[3] �����ð� �������� �̹����� ���������� �ٲ㰡�鼭 �ٽ� �׸����� ��û�ض�.
			int index = 0;
			while(true) {
				can.img = arr[index%9];
				can.repaint();
				
				index++;
				Thread.sleep(100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Test05 {
	public static void main(String[] args) {
		Window05 a = new Window05();	//â ����
	}
}
