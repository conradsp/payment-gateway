package org.apache.payment.gateway.dto.fineract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author Sanyam Goel created on 12/7/18
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientDTO {

    private int id;
    private int accountNo;
    private ClientStatusDTO statusDTO;
    private boolean active;
    private String activationDate;// Todo
    private String firstname;
    private String lastname;
    private String displayName;
    private int officeId;
    private String officeName;
    private ClientTimelineDTO timelineDTO;
    private int savingsProductId;
    private String savingsProductName;
//    private String groups;//Todo
    private ArrayList<String> groups;   // Check with mentor + community? group?


}
