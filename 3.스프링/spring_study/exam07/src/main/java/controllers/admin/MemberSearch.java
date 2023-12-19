package controllers.admin;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MemberSearch {
    private LocalDate sdate;
    private LocalDate edate;
}
