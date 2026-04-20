package com.sondang.cards.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(
        name = "CRUD REST APIs for Cards in MiniBank",
        description = "CRUD REST APIs in MiniBank to CREATE, UPDATE, FETCH and DELETE card details"
)
@RestController
@RequestMapping(path = "/api/cards", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
@Validated
public class CardsController {
}
