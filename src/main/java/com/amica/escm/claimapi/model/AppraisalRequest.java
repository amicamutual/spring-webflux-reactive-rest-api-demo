package com.amica.escm.claimapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AppraisalRequest extends BaseModel {

    private static final long serialVersionUID = 287470843631575519L;

    private String id;
    private String instructions;
    private TypeCode status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar statusDate;
    private TypeCode type;
    private ServiceProvider appraiser;    

    private String assigneeType;
    private String carrier;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar submittedDate;
    private String estimate;
    private TypeCode jobSize;
    private String jobType;
    @Setter(AccessLevel.PRIVATE)
    private List<AppraisalHistoryItem> historyItems = new ArrayList<>();

}
