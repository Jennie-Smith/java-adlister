package javabeans;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Author implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
}
