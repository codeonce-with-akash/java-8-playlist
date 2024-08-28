package com.java8.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private Long custId;
	private String custName;
	private String custEmail;
	private List<Long> phoneNumbers;
}
