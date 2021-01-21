package com.john.springboot.dto;

import com.john.springboot.entity.customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class customerAddressDto {

    private customer customer;
}
