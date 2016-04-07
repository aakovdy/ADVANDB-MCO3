package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class NodeView extends JFrame{
	private JTextField portNoTF;
	public NodeView() {
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JPanel serverPanel = new JPanel();
		serverPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		serverPanel.setBounds(12, 44, 640, 112);
		getContentPane().add(serverPanel);
		serverPanel.setLayout(null);
		
		portNoTF = new JTextField();
		portNoTF.setBounds(94, 24, 533, 28);
		serverPanel.add(portNoTF);
		portNoTF.setColumns(10);
		
		JLabel lblPort = new JLabel("Port #:");
		lblPort.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPort.setBounds(26, 36, 56, 16);
		serverPanel.add(lblPort);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(498, 75, 97, 25);
		serverPanel.add(btnConnect);
		
		JPanel tableResultPanel = new JPanel();
		tableResultPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableResultPanel.setBounds(664, 13, 1238, 1019);
		getContentPane().add(tableResultPanel);
		tableResultPanel.setLayout(null);
		
		JScrollPane t1ScrollPane = new JScrollPane();
		t1ScrollPane.setBounds(12, 13, 1214, 325);
		tableResultPanel.add(t1ScrollPane);
		
		JScrollPane t2ScrollPane = new JScrollPane();
		t2ScrollPane.setBounds(12, 351, 1214, 309);
		tableResultPanel.add(t2ScrollPane);
		
		JScrollPane t3ScrollPane = new JScrollPane();
		t3ScrollPane.setBounds(12, 673, 1214, 333);
		tableResultPanel.add(t3ScrollPane);
		
		JPanel clientPanel = new JPanel();
		clientPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		clientPanel.setBounds(12, 169, 640, 863);
		getContentPane().add(clientPanel);
		clientPanel.setLayout(null);
		
		JComboBox clientComboBox = new JComboBox();
		clientComboBox.setBounds(12, 25, 616, 22);
		clientPanel.add(clientComboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 75, 616, 775);
		clientPanel.add(panel);
		panel.setLayout(null);
		
		JRadioButton t1rdBTN = new JRadioButton("T1");
		t1rdBTN.setBounds(92, 57, 127, 25);
		panel.add(t1rdBTN);
		t1rdBTN.setEnabled(false);
		
		JRadioButton t2rdBTN = new JRadioButton("T2");
		t2rdBTN.setBounds(92, 286, 127, 25);
		panel.add(t2rdBTN);
		t2rdBTN.setEnabled(false);
		
		JRadioButton t3rdBTN = new JRadioButton("T3");
		t3rdBTN.setBounds(92, 512, 127, 25);
		panel.add(t3rdBTN);
		t3rdBTN.setEnabled(false);
		
		JRadioButton t1Serializeable = new JRadioButton("Serializeable");
		t1Serializeable.setBounds(161, 129, 127, 25);
		panel.add(t1Serializeable);
		
		JRadioButton t1ReadUncommit = new JRadioButton("Read-uncommitted");
		t1ReadUncommit.setBounds(161, 204, 137, 25);
		panel.add(t1ReadUncommit);
		
		JRadioButton t1ReadCommit = new JRadioButton("Read-committed");
		t1ReadCommit.setBounds(359, 129, 127, 25);
		panel.add(t1ReadCommit);
		
		JRadioButton t1RepeatRead = new JRadioButton("Repeatable Read");
		t1RepeatRead.setBounds(359, 204, 127, 25);
		panel.add(t1RepeatRead);
		
		JRadioButton t2Serializeable = new JRadioButton("Serializeable");
		t2Serializeable.setBounds(161, 352, 127, 25);
		panel.add(t2Serializeable);
		
		JRadioButton t3Serializeable = new JRadioButton("Serializeable");
		t3Serializeable.setBounds(161, 584, 127, 25);
		panel.add(t3Serializeable);
		
		JRadioButton t2ReadUncommit = new JRadioButton("Read-uncommitted");
		t2ReadUncommit.setBounds(161, 421, 137, 25);
		panel.add(t2ReadUncommit);
		
		JRadioButton t3ReadUncommit = new JRadioButton("Read-uncommitted");
		t3ReadUncommit.setBounds(161, 655, 137, 25);
		panel.add(t3ReadUncommit);
		
		JRadioButton t2ReadCommit = new JRadioButton("Read-committed");
		t2ReadCommit.setBounds(359, 352, 127, 25);
		panel.add(t2ReadCommit);
		
		JRadioButton t3ReadCommit = new JRadioButton("Read-committed");
		t3ReadCommit.setBounds(359, 584, 127, 25);
		panel.add(t3ReadCommit);
		
		JRadioButton t2RepeatRead = new JRadioButton("Repeatable Read");
		t2RepeatRead.setBounds(359, 421, 127, 25);
		panel.add(t2RepeatRead);
		
		JRadioButton t3RepeatRead = new JRadioButton("Repeatable Read");
		t3RepeatRead.setBounds(359, 655, 127, 25);
		panel.add(t3RepeatRead);
		
		ButtonGroup g1 = new ButtonGroup();
		
		g1.add(t1rdBTN);
		g1.add(t1Serializeable);
		g1.add(t1ReadUncommit);
		g1.add(t1ReadCommit);
		g1.add(t1RepeatRead);
		
		g1.add(t2rdBTN);
		g1.add(t2Serializeable);
		g1.add(t2ReadUncommit);
		g1.add(t2ReadCommit);
		g1.add(t2RepeatRead);
		
		g1.add(t3rdBTN);
		g1.add(t3Serializeable);
		g1.add(t3ReadUncommit);
		g1.add(t3ReadCommit);
		g1.add(t3RepeatRead);
		
				
		this.setLocationRelativeTo(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setVisible(true);
		
		
		
	}
}
