import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TableDemo extends JFrame{
	Label l;
	TableDemo(){
		super("Table Demo");
		String[] heading={"Name","Course","RollNo"};
		String[][] data={
					{"Bell","CSE","120"},
					{"Cell","CSD","121"},
					{"Kell","CE","122"},
					{"Yell","CSM","123"}
				       };
		JTable tp=new JTable(data,heading);
		JScrollPane jsp=new JScrollPane(tp);
		add(jsp);
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new TableDemo();
	}
}
