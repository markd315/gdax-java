package com.coinbase.exchange.api.entity;

import java.math.BigDecimal;

public class CryptoPaymentRequest extends MonetaryRequest {
  private String crypto_address;

  public CryptoPaymentRequest(BigDecimal amount, String currency, String crypto_address) {
    super(amount, currency);
    this.crypto_address = crypto_address;
  }

  public String getCryptoAddress() {
    return crypto_address;
  }

  public void setCryptoAddress(String cryptoAddress) {
    this.crypto_address = cryptoAddress;
  }
}
