package com.itransition.payment;

import com.itransition.payment.account.dto.AccountDto;
import com.itransition.payment.core.dto.TransactionInfoDto;
import com.itransition.payment.core.dto.TransactionReplenishDto;
import com.itransition.payment.core.dto.TransactionStateDto;
import com.itransition.payment.transaction.entity.Transaction;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static org.assertj.core.api.Assertions.assertThat;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AssertionsHelper {

    public static void verifyFieldsEqualityActualExpected(TransactionInfoDto actual, TransactionInfoDto expected) {
        assertThat(actual.getId()).isEqualTo(expected.getId());
        assertThat(actual.getExternalId()).isEqualTo(expected.getExternalId());
        assertThat(actual.getProvider()).isEqualTo(expected.getProvider());
        assertThat(actual.getStatus()).isEqualTo(expected.getStatus());
        assertThat(actual.getAdditionalData()).isEqualTo(expected.getAdditionalData());
    }

    public static void verifyFieldsEqualityActualExpected(TransactionStateDto actual, TransactionStateDto expected) {
        assertThat(actual.getId()).isEqualTo(expected.getId());
        assertThat(actual.getExternalId()).isEqualTo(expected.getExternalId());
        assertThat(actual.getProvider()).isEqualTo(expected.getProvider());
        assertThat(actual.getStatus()).isEqualTo(expected.getStatus());
        assertThat(actual.getAmount()).isEqualTo(expected.getAmount());
        assertThat(actual.getCommissionAmount()).isEqualTo(expected.getCommissionAmount());
        assertThat(actual.getAdditionalData()).isEqualTo(expected.getAdditionalData());
    }

    public static void verifyFieldsEqualityActualExpected(
            TransactionReplenishDto actual, TransactionReplenishDto expected) {
        assertThat(actual.getProvider()).isEqualTo(expected.getProvider());
        assertThat(actual.getOuterId()).isEqualTo(expected.getOuterId());
        assertThat(actual.getGateId()).isEqualTo(expected.getGateId());
        assertThat(actual.getOuterAt()).isEqualTo(expected.getOuterAt());
        assertThat(actual.getAccount()).isEqualTo(expected.getAccount());
        assertThat(actual.getAmount()).isEqualTo(expected.getAmount());
        assertThat(actual.getCommissionAmount()).isEqualTo(expected.getCommissionAmount());
    }

    public static void verifyFieldsEqualityActualExpected(Transaction actual, Transaction expected) {
        assertThat(actual.getId()).isEqualTo(expected.getId());
        assertThat(actual.getExternalId()).isEqualTo(expected.getExternalId());
        assertThat(actual.getProvider().getName()).isEqualTo(expected.getProvider().getName());
        assertThat(actual.getStatus()).isEqualTo(expected.getStatus());
        assertThat(actual.getReplenishmentStatus()).isEqualTo(expected.getReplenishmentStatus());
        assertThat(actual.getAmount()).isEqualTo(expected.getAmount());
        assertThat(actual.getCurrency()).isEqualTo(expected.getCurrency());
        assertThat(actual.getAdditionalData()).isEqualTo(expected.getAdditionalData());
    }

    public static void verifyFieldsEqualityActualExpected(AccountDto actual, AccountDto expected) {
        assertThat(actual.getFirstName()).isEqualTo(expected.getFirstName());
        assertThat(actual.getLastName()).isEqualTo(expected.getLastName());
        assertThat(actual.getMiddleName()).isEqualTo(expected.getMiddleName());
    }
}
