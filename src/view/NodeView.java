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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NodeView extends JFrame{
	private JTextField portNoTF;
	private String query;
	public NodeView() {
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		this.setSize(1187, 703);
		JPanel serverPanel = new JPanel();
		serverPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		serverPanel.setBounds(12, 13, 438, 112);
		getContentPane().add(serverPanel);
		serverPanel.setLayout(null);
		
		portNoTF = new JTextField();
		portNoTF.setBounds(69, 31, 347, 28);
		serverPanel.add(portNoTF);
		portNoTF.setColumns(10);
		
		JLabel lblPort = new JLabel("Port #:");
		lblPort.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPort.setBounds(12, 36, 56, 16);
		serverPanel.add(lblPort);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(319, 72, 97, 25);
		serverPanel.add(btnConnect);
		
		JPanel tableResultPanel = new JPanel();
		tableResultPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableResultPanel.setBounds(462, 13, 703, 638);
		getContentPane().add(tableResultPanel);
		tableResultPanel.setLayout(null);
		
		JScrollPane t1ScrollPane = new JScrollPane();
		t1ScrollPane.setBounds(12, 13, 678, 185);
		tableResultPanel.add(t1ScrollPane);
		
		JScrollPane t2ScrollPane = new JScrollPane();
		t2ScrollPane.setBounds(12, 211, 678, 201);
		tableResultPanel.add(t2ScrollPane);
		
		JScrollPane t3ScrollPane = new JScrollPane();
		t3ScrollPane.setBounds(12, 425, 678, 200);
		tableResultPanel.add(t3ScrollPane);
		
		JPanel clientPanel = new JPanel();
		clientPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		clientPanel.setBounds(12, 138, 438, 513);
		getContentPane().add(clientPanel);
		clientPanel.setLayout(null);
		
		JComboBox clientComboBox = new JComboBox();
		clientComboBox.setBounds(12, 25, 400, 22);
		clientPanel.add(clientComboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 75, 400, 424);
		clientPanel.add(panel);
		panel.setLayout(null);
		
		JRadioButton t1rdBTN = new JRadioButton("T1");
		t1rdBTN.setBounds(18, 19, 127, 25);
		panel.add(t1rdBTN);
		t1rdBTN.setEnabled(false);
		
		JRadioButton t2rdBTN = new JRadioButton("T2");
		t2rdBTN.setBounds(18, 149, 127, 25);
		panel.add(t2rdBTN);
		t2rdBTN.setEnabled(false);
		
		JRadioButton t3rdBTN = new JRadioButton("T3");
		t3rdBTN.setBounds(18, 267, 127, 25);
		panel.add(t3rdBTN);
		t3rdBTN.setEnabled(false);
		
		JRadioButton t1Serializeable = new JRadioButton("Serializeable");
		t1Serializeable.setBounds(42, 55, 127, 25);
		panel.add(t1Serializeable);
		
		JRadioButton t1ReadUncommit = new JRadioButton("Read-uncommitted");
		t1ReadUncommit.setBounds(42, 85, 137, 25);
		panel.add(t1ReadUncommit);
		
		JRadioButton t1ReadCommit = new JRadioButton("Read-committed");
		t1ReadCommit.setBounds(245, 55, 127, 25);
		panel.add(t1ReadCommit);
		
		JRadioButton t1RepeatRead = new JRadioButton("Repeatable Read");
		t1RepeatRead.setBounds(245, 85, 127, 25);
		panel.add(t1RepeatRead);
		
		JRadioButton t2Serializeable = new JRadioButton("Serializeable");
		t2Serializeable.setBounds(42, 178, 127, 25);
		panel.add(t2Serializeable);
		
		JRadioButton t3Serializeable = new JRadioButton("Serializeable");
		t3Serializeable.setBounds(42, 297, 127, 25);
		panel.add(t3Serializeable);
		
		JRadioButton t2ReadUncommit = new JRadioButton("Read-uncommitted");
		t2ReadUncommit.setBounds(42, 208, 137, 25);
		panel.add(t2ReadUncommit);
		
		JRadioButton t3ReadUncommit = new JRadioButton("Read-uncommitted");
		t3ReadUncommit.setBounds(42, 327, 137, 25);
		panel.add(t3ReadUncommit);
		
		JRadioButton t2ReadCommit = new JRadioButton("Read-committed");
		t2ReadCommit.setBounds(245, 178, 127, 25);
		panel.add(t2ReadCommit);
		
		JRadioButton t3ReadCommit = new JRadioButton("Read-committed");
		t3ReadCommit.setBounds(245, 297, 127, 25);
		panel.add(t3ReadCommit);
		
		JRadioButton t2RepeatRead = new JRadioButton("Repeatable Read");
		t2RepeatRead.setBounds(245, 208, 127, 25);
		panel.add(t2RepeatRead);
		
		JRadioButton t3RepeatRead = new JRadioButton("Repeatable Read");
		t3RepeatRead.setBounds(245, 327, 127, 25);
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
		
		if(t1Serializeable.isSelected()){
			query = "";
		}
		else if(t1ReadUncommit.isSelected()){
			query = "";
		}
		else if(t1ReadCommit.isSelected()){
			query = "";
		}
		else if(t1RepeatRead.isSelected()){
			query = "";
		}
		else if(t2Serializeable.isSelected()){
			query = "";
		}
		else if(t2ReadUncommit.isSelected()){
			query = "";
		}
		else if(t2ReadCommit.isSelected()){
			query = "";
		}
		else if(t2RepeatRead.isSelected()){
			query = "";
		}
		else if(t3Serializeable.isSelected()){
			query = "";
		}
		else if(t3ReadUncommit.isSelected()){
			query = "";
		}
		else if(t3ReadCommit.isSelected()){
			query = "";
		}
		else if(t3RepeatRead.isSelected()){
			query = "";
		}
			
		JButton prcsQryBTN = new JButton("Process Query");
		prcsQryBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		prcsQryBTN.setBounds(203, 361, 169, 25);
		panel.add(prcsQryBTN);
		
				
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		
	}
}
