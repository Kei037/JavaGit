package com.varxyz.banking.service;

package com.varxyz.banking.service;

public class TransferAccountTest {

    /**
    * 이체금액 50000.0원
    * 출금계좌 123-45-6789
    * 입금계좌 987-65-4321
    * 
    * 출금계좌에 50000.0원이 있는지 확인한 후 있다면 50000.0원을 출금한다.
    * 출금한 50000.0원을 입금계좌의 amount에 업데이트한다.
    *  - 출금계좌의 금액이 이체금액보다 작다면 사용자에게 잔액부족 메세지를 보내주어야 한다.
    *
    * 출금기능부터 입금기능까지 모두 성공해야 기능이 작동하고 하나라도 실패한다면
    * 실행된 기능들을 모두 취소하고 처음으로 돌아간다.
    * 관련이슈 :
    *    이체하기전 상대방의 정보를 확인할 수 있어야하고, 보내기 직전에 비밀번호를 입력해야 한다.
    *    이체금액이 계좌의 출금한도보다 크다면 이체를 할 수 없고, 출금한도초과 메세지를 보내주어야 한다.
    * @param args
    */

public static void main(String[] args) {

    TransferAccount test = new TransferAccount();
        test.transfer(50000.0, "123-45-6789", "987-65-4321");
    }

}
