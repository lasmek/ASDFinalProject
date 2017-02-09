package edu.mum.cs525.ccard.presentation;/*
        A basic implementation of the JDialog class.
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

import edu.mum.cs525.ccard.accountsubsystem.controller.BronzeCCardAccountVisitor;
import edu.mum.cs525.ccard.accountsubsystem.controller.GoldCCardAccountVisitor;
import edu.mum.cs525.ccard.accountsubsystem.controller.SilverCCardAccountVistor;
import edu.mum.cs525.finco.IFinCo;
import edu.mum.cs525.finco.accountsubsystem.controller.IAccountVisitor;
import edu.mum.cs525.finco.customersubsystem.model.Address;
import edu.mum.cs525.finco.customersubsystem.model.IAddress;
import edu.mum.cs525.finco.customersubsystem.model.IPerson;
import edu.mum.cs525.finco.customersubsystem.model.Person;
import edu.mum.cs525.finco.presentation.FinCoAddPersonAccountDialog;
import edu.mum.cs525.finco.presentation.FinCoMainFrame;

public class CCardAddPersonAccountDialog extends FinCoAddPersonAccountDialog {

    private static final long serialVersionUID = 8567304655766649204L;

    public CCardAddPersonAccountDialog(FinCoMainFrame myframe, IFinCo finco) {
        super(myframe, finco);

        // This code is automatically generated by Visual Cafe when you add
        // components to the visual environment. It instantiates and initializes
        // the components. To modify the code, only use code syntax that matches
        // what Visual Cafe can generate, or Visual Cafe may be unable to back
        // parse your Java file into its visual environment.
        //{{INIT_CONTROLS
        setTitle("Add credit card accountsubsystem");
        JRadioButton_Gold.setText("Gold");
        JRadioButton_Gold.setActionCommand("Gold");
        JRadioButton_Gold.setSelected(true);
        getContentPane().add(JRadioButton_Gold);
        JRadioButton_Gold.setBounds(36, 0, 84, 24);

        JRadioButton_Silver.setText("Silver");
        JRadioButton_Silver.setActionCommand("Silver");
        getContentPane().add(JRadioButton_Silver);
        JRadioButton_Silver.setBounds(36, 20, 84, 24);

        JRadioButton_Bronze.setText("Bronze");
        JRadioButton_Bronze.setActionCommand("Bronze");
        getContentPane().add(JRadioButton_Bronze);
        JRadioButton_Bronze.setBounds(36, 40, 84, 24);

        expireDateLabel.setText("Exp Date");
        getContentPane().add(expireDateLabel);
        expireDateLabel.setForeground(java.awt.Color.black);
        expireDateLabel.setBounds(12, 228, 48, 24);

        getContentPane().add(JTextField_ExpireDate);
        JTextField_ExpireDate.setBounds(84, 228, 156, 20);
        JTextField_ExpireDate.setText("7-Jun-1990");

    }


    javax.swing.JLabel expireDateLabel = new javax.swing.JLabel();
    //{{DECLARE_CONTROLS
    JRadioButton JRadioButton_Gold = new JRadioButton();
    JRadioButton JRadioButton_Silver = new JRadioButton();


    JRadioButton JRadioButton_Bronze = new JRadioButton();
    JLabel JLabel7 = new JLabel();
    JTextField JTextField_ExpireDate = new JTextField();
    //}}


    @Override
    protected void JButtonOK_actionPerformed(java.awt.event.ActionEvent event) {
        String accountNumber = JTextField_ACNR.getText();
        String name = JTextField_NAME.getText();
        String street = JTextField_STR.getText();
        String city = JTextField_CT.getText();
        String zip = JTextField_ZIP.getText();
        String state = JTextField_ST.getText();
//		String birthDate = JTextField_BD.getText();
        String email = JTextField_EM.getText();
        String expireDate = JTextField_ExpireDate.getText();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = null;
        try {
            date = formatter.parse(expireDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //TODO: Creating objects shouldnt be done here unless for meeting a deadline.
        //A factory of Spring DI can be used

        IAddress address = new Address(state, city, street, zip);

        IPerson person = new Person(address, name, null, email);
        person.setAddress(address);

        IAccountVisitor accountVisitor;
        if (JRadioButton_Gold.isSelected())
            accountVisitor = new GoldCCardAccountVisitor();
        else if (JRadioButton_Bronze.isSelected())
            accountVisitor = new GoldCCardAccountVisitor();
        else
        accountVisitor = new GoldCCardAccountVisitor();
        finco.addPersonAccount(accountVisitor, person, accountNumber);
        dispose();
    }

}