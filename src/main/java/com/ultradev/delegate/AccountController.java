package com.ultradev.delegate;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ultradev.openapi.model.AccountDto;
import com.ultradev.openapi.model.GetAccountsResponseDto;

/**
 * Implementation of REST API which allows to manage accounts.
 */
@RestController
public class AccountController implements com.ultradev.openapi.api.AccountsApi {

	@Override
	public ResponseEntity<GetAccountsResponseDto> getAccounts() {
		return ResponseEntity.ok(
				new GetAccountsResponseDto().items(Arrays.asList(createAccount("DEXXXX"), createAccount("ENYYYY"))));
	}

	private AccountDto createAccount(String iban) {
		AccountDto account = new AccountDto();
		account.setIban(iban);
		return account;
	}
}