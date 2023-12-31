package com.kh.jpatotalapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private String rank;
    private String image;
    private String title;
    private String score;
    private String rate;
    private String reservation;
    private String date;
}
