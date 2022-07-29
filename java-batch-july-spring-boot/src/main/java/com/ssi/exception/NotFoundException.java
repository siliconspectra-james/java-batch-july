package com.ssi.exception;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NotFoundException extends Exception{
    private String name;
}
