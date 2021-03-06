package com.itransition.payment.unit.transaction.service;

import com.itransition.payment.TestDataProvider;
import com.itransition.payment.transaction.repository.PaymentProviderRepository;
import com.itransition.payment.transaction.service.impl.PaymentProviderServiceImpl;
import java.util.Optional;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PaymentProviderServiceTest {

    @InjectMocks
    private PaymentProviderServiceImpl underTest;

    @Mock
    private PaymentProviderRepository paymentProviderRepository;

    @Test
    void shouldGetPaymentProviderByName() {
        val expected = TestDataProvider.getPaymentProvider();

        when(paymentProviderRepository.findByName(expected.getName())).thenReturn(Optional.of(expected));

        val actual = underTest.getByProvider(expected.getName());

        verify(paymentProviderRepository, times(1)).findByName(expected.getName());
        assertThat(actual.getId()).isEqualTo(expected.getId());
        assertThat(actual.getName()).isEqualTo(expected.getName());
    }

    @Test
    void shouldGetNullWhenPaymentProviderDoesntExist() {
        val providerName = "test";

        when(paymentProviderRepository.findByName(providerName)).thenReturn(Optional.empty());

        val actual = underTest.getByProvider(providerName);

        verify(paymentProviderRepository, times(1)).findByName(providerName);
        assertThat(actual).isNull();
    }
}
