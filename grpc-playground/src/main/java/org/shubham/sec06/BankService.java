package org.shubham.sec06;

import io.grpc.stub.StreamObserver;
import org.shubham.models.sec06.AccountBalance;
import org.shubham.models.sec06.BalanceCheckRequest;
import org.shubham.models.sec06.BankServiceGrpc;
import org.shubham.sec06.repository.AccountRepository;

public class BankService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getAccountBalance(BalanceCheckRequest request,
                        StreamObserver<AccountBalance> responseObserver) {
        var accountNumber = request.getAccountNum();
        var balance = AccountRepository.getBalance(accountNumber);
        var accountBalance = AccountBalance.newBuilder()
                .setAccountNum(accountNumber)
                .setBalance(balance)
                .build();

        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }
}
