import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class TreeDemo extends JFrame{
	TreeDemo(){
		super("Tree Demo");
		DefaultMutableTreeNode dmtn=new DefaultMutableTreeNode("Fruits");
		dmtn.add(new DefaultMutableTreeNode("apple"));
		dmtn.add(new DefaultMutableTreeNode("banana"));
		dmtn.add(new DefaultMutableTreeNode("grapes"));
		dmtn.add(new DefaultMutableTreeNode("mango"));
		JTree jt=new JTree(dmtn);
		add(jt);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new TreeDemo();
	}
}