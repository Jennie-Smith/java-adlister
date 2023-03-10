package javabeans;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Album implements Serializable {
    private int id;
    private String artist;
    private String albumName;
    private int releaseDate;
    private int sales;
    private String genre;
}
