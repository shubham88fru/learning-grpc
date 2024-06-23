package org.shubham.sec06;

import io.grpc.stub.StreamObserver;
import org.shubham.models.sec06.AccountBalance;
import org.shubham.models.sec06.BalanceCheckRequest;
import org.shubham.models.sec06.BankServiceGrpc;

public class BankService extends BankServiceGrpc.BankServiceImplBase {
    @Override
    public void getAccountBalance(BalanceCheckRequest request,
                        StreamObserver<AccountBalance> responseObserver) {
        var accountNumber = request.getAccountNum();
        var accountBalance = AccountBalance.newBuilder()
                .setAccountNum(accountNumber)
                .setBalance(accountNumber*10)
                .build();

        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }
}
