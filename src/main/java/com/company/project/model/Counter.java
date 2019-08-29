package com.company.project.model;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
public class Counter {
    @Id
    private Integer pknum;

    @Column(name = "clientPknum")
    private Integer clientpknum;

    @Column(name = "startDate")
    private Date startdate;

    @Column(name = "billingItem")
    private String billingitem;

    @Column(name = "totalCount")
    private Integer totalcount;

    private Date changedate;

    @Column(name = "endDate")
    private Date enddate;

    @Column(name = "serviceCodeList")
    private String servicecodelist;

}