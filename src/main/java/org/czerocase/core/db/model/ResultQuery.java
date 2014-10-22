package org.czerocase.core.db.model;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: raffaele.mastrangelo
 * Date: 13/12/12
 * Time: 21.24
 * To change this template use File | Settings | File Templates.
 */
public class ResultQuery {

    List<Record> records;

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
