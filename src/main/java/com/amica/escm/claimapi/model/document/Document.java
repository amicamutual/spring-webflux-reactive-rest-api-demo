package com.amica.escm.claimapi.model.document;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotNull;
import javax.xml.datatype.XMLGregorianCalendar;

import com.amica.escm.claimapi.model.BaseModel;
import com.amica.escm.claimapi.model.TypeCode;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Document extends BaseModel {
    
    private static final long serialVersionUID = 3817785598449815693L;
    
    private TypeCode category;
    private String storageSystem;
    private String groupId;
    private String batchId;
    private String grouping;
    private Boolean obsolete;
    private Boolean duplicate;
    private String description;
    private String author;
    private String name;
    private String mimeType;
    private String documentUID;
    private String source;
    private TypeCode type;
    private String externalDescription;
    private TypeCode externalName;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar createDate;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private XMLGregorianCalendar documentDate;
    private String uuid;
    private String id;
    @Setter(AccessLevel.PRIVATE)
    private Collection<Attachment> attachments = new ArrayList<>();
    @Setter(AccessLevel.PRIVATE)
    private Collection<Form> forms = new ArrayList<>();
}
