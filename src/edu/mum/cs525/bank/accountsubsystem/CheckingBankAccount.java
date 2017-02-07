package edu.mum.cs525.bank.accountsubsystem;

import edu.mum.cs525.finco.accountsubsystem.controller.EvaluateFunctor;
import edu.mum.cs525.finco.accountsubsystem.model.Account;
import edu.mum.cs525.finco.customersubsystem.model.Customer;
import edu.mum.cs525.finco.customersubsystem.model.ICustomer;

public class CheckingBankAccount extends Account {
    public CheckingBankAccount(ICustomer accountOwner, String accountNumber, double accountInterestRate, EvaluateFunctor evaluateFunctor) {
        super(accountOwner, accountNumber, accountInterestRate, evaluateFunctor);
    }

    public CheckingBankAccount(Customer accountOwner, String accountNumber, EvaluateFunctor evaluateFunctor) {

        super(accountOwner, accountNumber,0.0, evaluateFunctor);
    }

    public CheckingBankAccount() {
    }

}
