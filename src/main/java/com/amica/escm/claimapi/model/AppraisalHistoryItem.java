package com.amica.escm.claimapi.model;

import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AppraisalHistoryItem extends BaseModel {

    private static final long serialVersionUID = -9028111922873484486L;
    
    private String changeDescription;
    private String status;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssXXX")
    private XMLGregorianCalendar processTimestamp;
    private String modifiedBy;

}
