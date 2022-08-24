package it.develhope.Mail01.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotificationDto {

    private Long contactId;
    private String title;
    private String text;


}
