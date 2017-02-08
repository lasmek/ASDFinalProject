

package edu.mum.cs525.finco.presentation;/*
		A basic implementation of the JDialog class.
*/

import javax.swing.*;

import edu.mum.cs525.finco.IFinCo;
import edu.mum.cs525.finco.customersubsystem.model.Address;
import edu.mum.cs525.finco.customersubsystem.model.IAddress;
import edu.mum.cs525.finco.customersubsystem.model.IPerson;
import edu.mum.cs525.finco.customersubsystem.model.Person;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinCoJDialog_AddPAcc extends JDialog
{
	private static final long serialVersionUID = -3120942598423814741L;
	private FinCoMainFrame parentframe;
	protected IFinCo finco;
	public FinCoJDialog_AddPAcc(FinCoMainFrame parent, IFinCo finco)
	{
		super(parent);
		parentframe=parent;
		this.finco = finco;

		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.
		//{{INIT_CONTROLS
		setTitle("Add new personal account");
		setModal(true);
		getContentPane().setLayout(null);
		setSize(283,303);
		setVisible(false);
		JRadioButton_Chk.setText("Checkings");
		JRadioButton_Chk.setActionCommand("Checkings");
		getContentPane().add(JRadioButton_Chk);
		JRadioButton_Chk.setBounds(36,0,84,24);
		JRadioButton_Sav.setText("Savings");
		JRadioButton_Sav.setActionCommand("Savings");
		getContentPane().add(JRadioButton_Sav);
		JRadioButton_Sav.setBounds(36,24,84,24);
		JLabel1.setText("Name");
		getContentPane().add(JLabel1);
		JLabel1.setForeground(Color.black);
		JLabel1.setBounds(12,84,48,24);
		JLabel2.setText("Street");
		getContentPane().add(JLabel2);
		JLabel2.setForeground(Color.black);
		JLabel2.setBounds(12,108,48,24);
		JLabel3.setText("City");
		getContentPane().add(JLabel3);
		JLabel3.setForeground(Color.black);
		JLabel3.setBounds(12,132,48,24);
		JLabel4.setText("State");
		getContentPane().add(JLabel4);
		JLabel4.setForeground(Color.black);
		JLabel4.setBounds(12,156,48,24);
		JLabel5.setText("Zip");
		getContentPane().add(JLabel5);
		JLabel5.setForeground(Color.black);
		JLabel5.setBounds(12,180,48,24);
		JLabel6.setText("Birthdate");
		getContentPane().add(JLabel6);
		JLabel6.setForeground(Color.black);
		JLabel6.setBounds(12,204,96,24);
		JLabel7.setText("Email");
		getContentPane().add(JLabel7);
		JLabel7.setForeground(Color.black);
		JLabel7.setBounds(12,228,48,24);
		getContentPane().add(JTextField_NAME);
		JTextField_NAME.setBounds(84,84,156,20);
		getContentPane().add(JTextField_CT);
		JTextField_CT.setBounds(84,132,156,20);
		getContentPane().add(JTextField_ST);
		JTextField_ST.setBounds(84,156,156,20);
		getContentPane().add(JTextField_STR);
		JTextField_STR.setBounds(84,108,156,20);
		getContentPane().add(JTextField_ZIP);
		JTextField_ZIP.setBounds(84,180,156,20);
		getContentPane().add(JTextField_BD);
		JTextField_BD.setBounds(84,204,156,20);
		JTextField_BD.setText("7-Jun-1990");
		getContentPane().add(JTextField_EM);
		JTextField_EM.setBounds(84,228,156,20);
		JButton_OK.setText("OK");
		JButton_OK.setActionCommand("OK");
		getContentPane().add(JButton_OK);
		JButton_OK.setBounds(48,264,84,24);
		JButton_Cancel.setText("Cancel");
		JButton_Cancel.setActionCommand("Cancel");
		getContentPane().add(JButton_Cancel);
		JButton_Cancel.setBounds(156,264,84,24);
		getContentPane().add(JTextField_ACNR);
		JTextField_ACNR.setBounds(84,60,156,20);
		JLabel8.setText("Acc Nr");
		getContentPane().add(JLabel8);
		JLabel8.setForeground(Color.black);
		JLabel8.setBounds(12,60,48,24);
		//}}

		//{{REGISTER_LISTENERS
		SymMouse aSymMouse = new SymMouse();
		JRadioButton_Chk.addMouseListener(aSymMouse);
		JRadioButton_Sav.addMouseListener(aSymMouse);
		SymAction lSymAction = new SymAction();
		JButton_OK.addActionListener(lSymAction);
		JButton_Cancel.addActionListener(lSymAction);
		//}}
	}




	//{{DECLARE_CONTROLS
	JRadioButton JRadioButton_Chk = new JRadioButton();
	JRadioButton JRadioButton_Sav = new JRadioButton();
	JLabel JLabel1 = new JLabel();
	JLabel JLabel2 = new JLabel();
	JLabel JLabel3 = new JLabel();
	JLabel JLabel4 = new JLabel();
	JLabel JLabel5 = new JLabel();
	JLabel JLabel6 = new JLabel();
	protected JLabel JLabel7 = new JLabel();
	protected JTextField JTextField_NAME = new JTextField();
	protected JTextField JTextField_CT = new JTextField();
	protected JTextField JTextField_ST = new JTextField();
	protected JTextField JTextField_STR = new JTextField();
	protected JTextField JTextField_ZIP = new JTextField();
	protected JTextField JTextField_BD = new JTextField();
	protected JTextField JTextField_EM = new JTextField();
	JButton JButton_OK = new JButton();
	JButton JButton_Cancel = new JButton();
	protected JTextField JTextField_ACNR = new JTextField();
	JLabel JLabel8 = new JLabel();
	//}}


	class SymMouse extends java.awt.event.MouseAdapter
	{
		public void mouseClicked(java.awt.event.MouseEvent event)
		{
			Object object = event.getSource();
			if (object == JRadioButton_Chk)
				JRadioButtonChk_mouseClicked(event);
			else if (object == JRadioButton_Sav)
				JRadioButtonSav_mouseClicked(event);
		}
	}

	void JRadioButtonChk_mouseClicked(java.awt.event.MouseEvent event)
	{
		//When Checking radio is clicked make this radio on
		//and make Saving accountsubsystem radio off
		JRadioButton_Chk.setSelected(true);
		JRadioButton_Sav.setSelected(false);
	}

	void JRadioButtonSav_mouseClicked(java.awt.event.MouseEvent event)
	{
		//When Saving radio is clicked make this radio on
		//and make Checking accountsubsystem radio off
		JRadioButton_Chk.setSelected(false);
		JRadioButton_Sav.setSelected(true);

	}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == JButton_OK)
				JButtonOK_actionPerformed(event);
			else if (object == JButton_Cancel)
				JButtonCalcel_actionPerformed(event);
		}
	}

	protected void JButtonOK_actionPerformed(java.awt.event.ActionEvent event)
	{
		String accountNumber =JTextField_ACNR.getText();
		String name =JTextField_NAME.getText();
		String street=JTextField_STR.getText();
		String city = JTextField_CT.getText();
		String zip=JTextField_ZIP.getText();
		String state=JTextField_ST.getText();
		String birthDate = JTextField_BD.getText();
		String email = JTextField_EM.getText();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = null;
		try {
			date = formatter.parse(birthDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//TODO: Creating objects shouldnt be done here unless for meeting a deadline.
		//A factory of Spring DI can be used
        
		IAddress address = new Address(state, city, street, zip); 

		IPerson person = new Person(address, name, date, email);
		person.setAddress(address);
		finco.addPersonAccount(person, accountNumber);
		dispose();
	}

	void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event)
	{
		//make this frame invisible if Cancel button is clicked
		dispose();
	}
}
