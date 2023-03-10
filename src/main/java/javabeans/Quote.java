package javabeans;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Quote implements Serializable {
    private int id;
    private String content;
    private Author author;

}
