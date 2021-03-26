package com.mu.page;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class PageResult {
private Integer total;
private List rows;
public PageResult(Integer total, List rows) {
	super();
	this.total = total;
	this.rows = rows;
}

}
