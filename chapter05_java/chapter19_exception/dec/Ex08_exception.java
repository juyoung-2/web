package org.joonzis.ex;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

class BankAccount{
	// 필드
	private String no;		// 계좌번호
	private long balance;	// 잔액
	public BankAccount(String no, long balance) {
		this.no = no;
		this.balance = balance;
	}
	// 입금
	public void deposit(long money) throws DepositException{
		if(money < 0) {
			throw new DepositException(1000, "0보다 작으면 입금 불가!");
		}
		balance += money;
	}
	// 출금
	public void withdraw(long money) throws WithdrawException{
		if(balance < money) {
			throw new WithdrawException(2000, "잔액보다 크면 출금 불가");
		}else if(money < 0) {
			throw new WithdrawException(2001, "0보다 작으면 출금 불가");
		}
		balance -= money;
	}
	// 조회
	public void inquiry() {
		System.out.println("계좌 번호 : " + no);
		System.out.println("계좌 잔액 : " + balance);
	}
	// 이체
	public void transfer(BankAccount account, long money)
		throws DepositException, WithdrawException{
		withdraw(money);
		account.deposit(money);
	}
}
// 입금 예외 클래스
class DepositException extends Exception{
	private static final long serialVersionUID = 1L;
	private int errCode;
	public DepositException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
}
// 출금 예외 클래스
class WithdrawException extends Exception{
	private static final long serialVersionUID = 1L;
	private int errCode;
	public WithdrawException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
}
public class Ex08_exception {
	public static void main(String[] args) {
		BankAccount parent = new BankAccount("123-456", 0);
		BankAccount child = new BankAccount("654-321", 0);
		try {
			// 입금 후 조회
			parent.deposit(1000); // 입금 예외
			parent.inquiry();
			// 출금 후 조회
			parent.withdraw(500);
			parent.inquiry();
			
			// 부모 계좌에서 자식 계좌로 500원 이체
			parent.transfer(child, 500);
			parent.inquiry();
			child.inquiry();
			
		} catch (DepositException e) {
			System.out.println(
				"DepositException 에러 메세지 : " + e.getMessage() +
				"(코드 : " + e.getErrCode() + ")" 
			);
		} catch (WithdrawException e) {
			System.out.println(
				"WithdrawException 에러 메세지 : " + e.getMessage() +
				"(코드 : " + e.getErrCode() + ")" 
			);
		}
	}
}







